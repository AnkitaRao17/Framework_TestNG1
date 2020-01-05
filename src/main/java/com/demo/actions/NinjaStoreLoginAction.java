package com.demo.actions;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.demo.locators.NinjaStoreLoginLocators;
import com.demo.util.JsonFileReader;
import com.demo.util.PropertyFileReader;
import com.relevantcodes.extentreports.LogStatus;

public class NinjaStoreLoginAction extends SeleniumWrappers {

	PropertyFileReader propertyReader = new PropertyFileReader();
	NinjaStoreLoginLocators obj = new NinjaStoreLoginLocators(driver);
	
	public void amzonlogin() throws InterruptedException {
		addLog("User entring username");
		userType(obj.email_address, propertyReader.getProperties("username"));
		sleep(3000);
		
		addLog("User entring password");
		userType(obj.password, propertyReader.getProperties("password"));
		sleep(3000);
		
		addLog("User cicking sing btn");
		userClick(obj.signinbtn);
		
		//json code
		String fname = JsonFileReader.getJsonValue("$.registration.fname");
		addLog("Reading test data from json file "+fname);
		
		addLog("User cicking edit btn");

		verifyTest(obj.edit_account.getText(), "Edit Account", "Validating edit accout text");
		
		
		/*
		 * test.log(LogStatus.INFO, "User cicking logout btn"); Actions acts =new
		 * Actions(driver); Action
		 * act=acts.click(obj.my_account).moveToElement(obj.logout).click(obj.logout).
		 * build(); act.perform(); Thread.sleep(5000);
		 * 
		 * System.out.print(obj.logout_text.getText()); Thread.sleep(5000);
		 */

	}
}
