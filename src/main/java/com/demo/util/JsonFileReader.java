package com.demo.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.jayway.jsonpath.JsonPath;

public class JsonFileReader {

	public static String getJsonValue(String jsonPath) {
	
		String path = System.getProperty("user.dir")+"/src/main/resources/data/TestData.json";
		String jsonString = null;
		try {
			jsonString = new String(Files.readAllBytes(Paths.get(path)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = JsonPath.read(jsonString, jsonPath);		
		return value;	
	}
}
