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
package com.facebook.swift.generics;

import com.facebook.nifty.client.FramedClientConnector;
import com.facebook.swift.codec.ThriftCodecManager;
import com.facebook.swift.dsl.DSL;
import com.facebook.swift.dsl.executor.info.Step;
import com.facebook.swift.dsl.formats.test.TestDSL;
import com.facebook.swift.service.ThriftClient;
import com.facebook.swift.service.ThriftClientManager;
import com.facebook.swift.service.ThriftEventHandler;
import com.facebook.swift.service.ThriftServer;
import com.facebook.swift.service.ThriftServerConfig;
import com.facebook.swift.service.ThriftServiceProcessor;
import com.google.common.collect.ImmutableList;
import com.google.common.net.HostAndPort;
import com.google.gson.Gson;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import static org.testng.AssertJUnit.assertEquals;

public class TestGenericProcessor
{
    @Test
    public void testGenericProcessor()
            throws ExecutionException, InterruptedException
    {
    	ArrayList<Object> inputs = new ArrayList<>();
      
      int count = 0;
      
      HashMap<Integer, ArrayList<HashMap<Integer, Step>>> out = new HashMap<Integer, ArrayList<HashMap<Integer,Step>>>();
      
      new TestDSL(0);
		  
		  count ++;

		  TestDSL.getInstance().mess("BeforeStart");
		  TestDSL.getInstance().execute("Start", 1, "", null);
		  TestDSL.getInstance().mess("Start");

        ThriftCodecManager codecManager = new ThriftCodecManager();
        ThriftServiceProcessor processor = new ThriftServiceProcessor(codecManager, ImmutableList.<ThriftEventHandler>of(), new GenericService());

        try (ThriftServer server = new ThriftServer(processor, new ThriftServerConfig()).start();
             ThriftClientManager clientManager = new ThriftClientManager(codecManager)) {
            ThriftClient<GenericInterface.Client> clientOpener = new ThriftClient<>(clientManager, GenericInterface.Client.class);
            try (GenericInterface.Client client = clientOpener.open(new FramedClientConnector(HostAndPort.fromParts("localhost", server.getPort()))).get()) {
                GenericStruct<String> original = new GenericStruct<>();
                original.genericField = "original.genericField";
                GenericStruct<String> copy = client.echo(original);
                assertEquals(original, copy);
            }
        }
        

  		  TestDSL.getInstance().mess("BeforeTerminate");
  		  TestDSL.getInstance().execute("Terminate", 3, "", null);
  		  TestDSL.getInstance().mess("Terminate");
  		  out.put(count, TestDSL.getInstance().getBuffer());
  		  
  		  DSL.send(new Gson().toJson(out), "testGenericProcessor");
    }
}
