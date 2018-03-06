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
package com.facebook.swift.dsl.formats.test;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.jboss.netty.channel.Channel;

import com.facebook.swift.dsl.DSL;
import com.facebook.swift.dsl.executor.Executor;
import com.facebook.swift.dsl.executor.info.ExecData;
import com.facebook.swift.dsl.executor.info.Step;
import com.facebook.swift.dsl.formats.detection_log.LogUtils;

public class TestDSL extends DSL {

  private ExecData data;
  private static volatile TestDSL instance;

  public static TestDSL getInstance() {
    return instance;
  }
  
  public TestDSL(ArrayList<String> inputs, ArrayList<String> outputs) {
    super(inputs, outputs);
    instance = this;
    data = new ExecData();
    
//    for (EventAtMinute e : inputs) {
//      ExecData d = new ExecData();
//
//      d.toEnvironment("answer", 2, true);
//      d.toEnvironment("date1", 0, true);
//      d.toEnvironment("date2", 0, true);
//      d.toEnvironment("date1_diff", 0, true);
//      d.toEnvironment("date2_diff", 0, true);
//      d.toEnvironment("output", 0, true);
//      d.toEnvironment("terminate", false, true);
//      d.toEnvironment("client_id", client_id, true);
//      d.toEnvironment("client", client, false);
//      d.toEnvironment("log", inputs, false);
//    
//      d.toProgram("id", Executor.BEGIN);
//      d.toProgram("program", "begin");
//      
//      d.toArgument("id", e.getOut(command));
//      d.toArgument("event", e);
//    
//      if (command.equals("query")) 
//        d.toEnvironment("anomaly_type", QUERY, false);
//      else if (command.equals("status")) 
//        d.toEnvironment("anomaly_type", STATUS, false);
//      else if (command.equals("sla")) 
//        d.toEnvironment("anomaly_type", SLA, false);
//      
//      data.add(d); 
//    }
  }

  public void execute(String command, Integer id, ArrayList<String> args, HashMap<String, Object> envs) {
    data.toProgram("id", id);
    data.toProgram("program", "asses"+command);
    
    if (command.toLowerCase().equals("terminate")) {
      data.toEnvironment("terminate", true, true);
      data.flush_buffer(out);
      data.clear();
      send(null);
    } else {
      if (args != null) {
        int count = 0;
        for ( String arg : args) {
          count ++;
          data.toArgument("id"+count, arg);
        }
      }
      
      for ( Entry<String, Object> env : envs.entrySet() )
        data.toEnvironment(env.getKey(), env.getValue(), true);
      send(envs.toString()+" - "+args);
    }
    data.next_step();
  }
}


