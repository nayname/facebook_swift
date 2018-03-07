/*
 * Copyright (C) 2012 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.swift.client;

import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.facebook.swift.dsl.DSL;
import com.facebook.swift.dsl.executor.info.Step;
import com.facebook.swift.dsl.formats.redirect.RedirectDSL;
import com.facebook.swift.dsl.formats.test.TestDSL;
import com.facebook.swift.service.ThriftServerConfig;
import com.facebook.swift.service.async.DelayedMap;
import com.facebook.swift.service.async.DelayedMapSyncHandler;
import com.facebook.swift.service.base.SuiteBase;
import com.google.gson.Gson;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestThriftClientManager extends SuiteBase<DelayedMap.Service, DelayedMap.Client>
{
  public static final String LOCALHOST_IP_ADDRESS = "127.0.0.1";
  private static String dsl_buffer = "/root/data/dsl_buffer/";

  public TestThriftClientManager()
  {
    super(DelayedMapSyncHandler.class, DelayedMap.Client.class, new ThriftServerConfig().setBindAddress(LOCALHOST_IP_ADDRESS));
  }

  @Test
  public void testUnresolvedRemoteAddress()
  {
    // Test that getRemoteAddress on a client that connected to '127.0.0.1' does not resolve the IP to 'localhost'
    // (because doing a reverse lookup causes performance problems - e.g. for logging code)

    try {
      ArrayList<String> inputs = new ArrayList<>();
      inputs.add("127.0.0.1");
      inputs.add("127.0.0.2");
      inputs.add("127.0.0");
      inputs.add("127.0.0.1");
      inputs.add("127.0.0.1");
      inputs.add("138.0.0.1");
      
      int count = 0;
      
      HashMap<Integer, ArrayList<HashMap<Integer, Step>>> out = new HashMap<Integer, ArrayList<HashMap<Integer,Step>>>(); 

      for ( String input : inputs ) {
    	  if (input != null) {
    		  new TestDSL();
    		  
    		  count ++;

    		  TestDSL.getInstance().mess("BeforeStart");
    		  TestDSL.getInstance().execute("Start", 1, input, null);
    		  TestDSL.getInstance().mess("Start");

    		  getClientManager().getRemoteAddress(getClient());

    		  TestDSL.getInstance().mess("BeforeTerminate");
    		  TestDSL.getInstance().execute("Terminate", 3, "", null);
    		  TestDSL.getInstance().mess("Terminate");
    		  out.put(count, TestDSL.getInstance().getBuffer());
    	  }
      }
      DSL.send(new Gson().toJson(out));
      
    }
    catch (Exception e) {
    	throw new IllegalArgumentException(e.getMessage(), e);
    }

  }
}
