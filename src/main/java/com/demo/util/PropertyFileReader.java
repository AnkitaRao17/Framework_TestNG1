package com.demo.util;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertyFileReader {
	
	InitilizeVariable initilizeEnv = new InitilizeVariable();
	
	public String getProperties(String key) {
		Properties prop = new Properties();
		String value = null;
		try {
			String path = System.getProperty("user.dir")+"/src/main/resources/env/"+initilizeEnv.getEnvName()+".properties";
			System.out.println(path);			
			File f = new File(path);
			FileReader reader=new FileReader(f);		    
			prop.load(reader);
			System.out.println(prop.getProperty(key));
			value = prop.getProperty(key);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return value;
	}

}
