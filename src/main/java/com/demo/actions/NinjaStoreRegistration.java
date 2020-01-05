package com.demo.actions;

import com.demo.locators.NinjaStoreLoginLocators;
import com.demo.locators.NinjaStoreRegistrationLocaters;
import com.demo.util.JsonFileReader;
import com.demo.util.PropertyFileReader;

public class NinjaStoreRegistration extends SeleniumWrappers {
	
	
	/*
	 * "fname":"sahil", "lname":"test", "email":""
	 */
	
	PropertyFileReader propertyReader = new PropertyFileReader();
	NinjaStoreRegistrationLocaters objj = new NinjaStoreRegistrationLocaters(driver);
	
	public void registration() throws InterruptedException {
		/*
		 * //json code String firstnamer =
		 * JsonFileReader.getJsonValue("$.registration.firstnamer");
		 * 
		 * String lastname = JsonFileReader.getJsonValue("$.registration.lastname");
		 * String email = JsonFileReader.getJsonValue("$.registration.email");
		 * 
		 */
		addLog("User entring firstname");
		userType(objj.firstnamer, JsonFileReader.getJsonValue("$.registration.firstnamer"));
		sleep(3000);
		
		addLog("User entring lastname");
		userType(objj.lastname, JsonFileReader.getJsonValue("$.registration.lastname"));
		sleep(3000);
		
		addLog("User entring email");
		userType(objj.email, JsonFileReader.getJsonValue("$.registration.email"));
		sleep(3000);
		
		addLog("User entring telephone");
		userType(objj.telephone,  JsonFileReader.getJsonValue("$.registration.telephone"));
		sleep(3000);
		
		addLog("User entring password");
		userType(objj.password, JsonFileReader.getJsonValue("$.registration.password"));
		sleep(3000);
		
		addLog("User entring confirm password");
		userType(objj.confirmpassword, JsonFileReader.getJsonValue("$.registration.confirmpassword"));
		sleep(3000);
		
		addLog("User cicking continue btn");
		userClick(objj.agreecheckbox);
		
		addLog("User cicking continue btn");
		userClick(objj.continuebtn);
		
		
		
	}

}
