/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.core.api.util.concurrent;

import java.util.concurrent.CountDownLatch;

// @ThreadSafe
public class Latch extends CountDownLatch {

  public Latch() {
    super(1);
  }

  public void release() {
    countDown();
  }

}
