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
package com.facebook.swift.dsl;

import java.util.ArrayList;

import com.facebook.swift.dsl.executor.Executor;
import com.facebook.swift.dsl.executor.info.ExecData;

import java.util.HashMap;

import com.facebook.swift.dsl.DSL;
import com.facebook.swift.dsl.data.Utils;
import com.facebook.swift.dsl.executor.Executor;
import com.facebook.swift.dsl.executor.info.ExecData;
import com.facebook.swift.dsl.executor.info.Step;
import com.google.gson.Gson;

public class DSL {

	public Executor exec;
	public ArrayList<ExecData> data;
	protected ArrayList<HashMap<Integer, Step>> out = new ArrayList<HashMap<Integer, Step>>();

	public DSL () {
		exec = new Executor();
		data = new ArrayList<ExecData>();
	}

	public ArrayList<HashMap<Integer, Step>> getBuffer() {
		return out;
			//Utils.writeFile(tmp, "/root/NeuralProgramSynthesis/dsl/data/data_buffer.json", false);
	}

	public void mess(String mess) {
		try {
			ArrayList<String> tmp = new ArrayList<String>();
			tmp.add(mess);
			Utils.writeFile(tmp, "/root/NeuralProgramSynthesis/dsl/data/error.json", true);
		}
		catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage(), e);
		}
	}
	
	public static void send(String mess, String label) {
		try {
			ArrayList<String> tmp = new ArrayList<String>();
			tmp.add(mess);
			Utils.writeFile(tmp, "/root/NeuralProgramSynthesis/dsl/data/"+label+".json", false);
		}
		catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage(), e);
		}
	}
}
