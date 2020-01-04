package com.demo.actions;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.demo.locators.NinjaStoreLoginLocators;
import com.demo.util.JsonFileReader;
import com.demo.util.PropertyFileReader;
import com.relevantcodes.extentreports.LogStatus;

public class NinjaStoreLoginAction extends NinjaStoreBaseClass {

	PropertyFileReader propertyReader = new PropertyFileReader();
	
	public void amzonlogin() throws InterruptedException {
		
		NinjaStoreLoginLocators obj = new NinjaStoreLoginLocators(driver);
		
		test.log(LogStatus.INFO, "User entring username");
		obj.email_address.sendKeys(propertyReader.getProperties("username"));
		Thread.sleep(5000);
		
		test.log(LogStatus.INFO, "User entring password");
		obj.password.sendKeys(propertyReader.getProperties("password"));
		Thread.sleep(5000);
		
		test.log(LogStatus.INFO, "User cicking sing btn");
		obj.signinbtn.click();
		Thread.sleep(5000);
		
		String fname = JsonFileReader.getJsonValue("$.registration.fname");
		
		System.out.println("------------------------------"+fname);
		
		test.log(LogStatus.INFO, "User cicking edit btn");
		if(obj.edit_account.getText().equalsIgnoreCase("Edit Account"))
		{
		System.out.print(obj.edit_account.getText());
		Thread.sleep(5000);
		}
		
		
		if(false) {
			test.log(LogStatus.PASS, "Data mateched");
		}else {
			test.log(LogStatus.FAIL, "Data not matehced");
			Assert.assertTrue(false);
		}
		
		test.log(LogStatus.INFO, "User cicking logout btn");
		Actions acts =new Actions(driver);
		Action act=acts.click(obj.my_account).moveToElement(obj.logout).click(obj.logout).build();
		act.perform();
		Thread.sleep(5000);
		
		System.out.print(obj.logout_text.getText());
		Thread.sleep(5000);

	}
}
