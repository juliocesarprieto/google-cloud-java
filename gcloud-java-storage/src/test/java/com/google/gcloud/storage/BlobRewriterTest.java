/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gcloud.storage;

import static org.easymock.EasyMock.anyObject;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.google.common.collect.ImmutableMap;
import com.google.gcloud.RestorableState;
import com.google.gcloud.spi.StorageRpc;
import com.google.gcloud.spi.StorageRpc.RewriteRequest;
import com.google.gcloud.spi.StorageRpc.RewriteResponse;
import com.google.gcloud.spi.StorageRpcFactory;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import java.io.IOException;
import java.util.Map;

public class BlobRewriterTest {

  private static final String SOURCE_BUCKET_NAME = "b";
  private static final String SOURCE_BLOB_NAME = "n";
  private static final String DESTINATION_BUCKET_NAME = "b1";
  private static final String DESTINATION_BLOB_NAME = "n1";
  private static final BlobId BLOB_ID = BlobId.of(SOURCE_BUCKET_NAME, SOURCE_BLOB_NAME);
  private static final BlobInfo BLOB_INFO =
      BlobInfo.builder(DESTINATION_BUCKET_NAME, DESTINATION_BLOB_NAME).build();
  private static final BlobInfo RESULT =
      BlobInfo.builder(DESTINATION_BUCKET_NAME, DESTINATION_BLOB_NAME).contentType("type").build();
  private static final Map<StorageRpc.Option, ?> EMPTY_OPTIONS = ImmutableMap.of();
  private static final RewriteRequest REQUEST = new StorageRpc.RewriteRequest(BLOB_ID.toPb(),
      EMPTY_OPTIONS, BLOB_INFO.toPb(), EMPTY_OPTIONS, null);
  private static final RewriteResponse RESPONSE = new StorageRpc.RewriteResponse(REQUEST,
      null, 42L, false, "token", 21L);
  private static final RewriteResponse RESPONSE_DONE = new StorageRpc.RewriteResponse(REQUEST,
      RESULT.toPb(), 42L, true, "token", 42L);

  private StorageOptions options;
  private StorageRpcFactory rpcFactoryMock;
  private StorageRpc storageRpcMock;
  private BlobRewriter rewriter;

  @Before
  public void setUp() throws IOException, InterruptedException {
    rpcFactoryMock = createMock(StorageRpcFactory.class);
    storageRpcMock = createMock(StorageRpc.class);
    expect(rpcFactoryMock.create(anyObject(StorageOptions.class)))
        .andReturn(storageRpcMock);
    replay(rpcFactoryMock);
    options = StorageOptions.builder()
        .projectId("projectid")
        .serviceRpcFactory(rpcFactoryMock)
        .build();
  }

  @After
  public void tearDown() throws Exception {
    verify(rpcFactoryMock, storageRpcMock);
  }

  @Test
  public void testRewrite() {
    EasyMock.expect(storageRpcMock.continueRewrite(RESPONSE)).andReturn(RESPONSE_DONE);
    EasyMock.replay(storageRpcMock);
    rewriter = new BlobRewriter(options, RESPONSE);
    rewriter.copyChunk();
    assertTrue(rewriter.isDone());
    assertEquals(RESULT, rewriter.result());
    assertEquals(new Long(42L), rewriter.totalBytesRewritten());
    assertEquals(new Long(42L), rewriter.blobSize());
  }

  @Test
  public void testRewriteMultipleRequests() {
    EasyMock.expect(storageRpcMock.continueRewrite(RESPONSE)).andReturn(RESPONSE);
    EasyMock.expect(storageRpcMock.continueRewrite(RESPONSE)).andReturn(RESPONSE_DONE);
    EasyMock.replay(storageRpcMock);
    rewriter = new BlobRewriter(options, RESPONSE);
    int loopCount = 0;
    while (!rewriter.isDone()) {
      rewriter.copyChunk();
      loopCount++;
    }
    assertTrue(rewriter.isDone());
    assertEquals(RESULT, rewriter.result());
    assertEquals(new Long(42L), rewriter.totalBytesRewritten());
    assertEquals(new Long(42L), rewriter.blobSize());
    assertEquals(2, loopCount);
  }

  @Test
  public void testSaveAndRestore() throws IOException {
    EasyMock.expect(storageRpcMock.continueRewrite(RESPONSE)).andReturn(RESPONSE);
    EasyMock.expect(storageRpcMock.continueRewrite(RESPONSE)).andReturn(RESPONSE_DONE);
    EasyMock.replay(storageRpcMock);
    rewriter = new BlobRewriter(options, RESPONSE);
    rewriter.copyChunk();
    assertTrue(!rewriter.isDone());
    assertEquals(null, rewriter.result());
    assertEquals(new Long(21L), rewriter.totalBytesRewritten());
    assertEquals(new Long(42L), rewriter.blobSize());
    RestorableState<BlobRewriter> rewriterState = rewriter.capture();
    BlobRewriter restoredRewriter = rewriterState.restore();
    restoredRewriter.copyChunk();
    assertTrue(restoredRewriter.isDone());
    assertEquals(RESULT, restoredRewriter.result());
    assertEquals(new Long(42L), restoredRewriter.totalBytesRewritten());
    assertEquals(new Long(42L), restoredRewriter.blobSize());
  }
}
