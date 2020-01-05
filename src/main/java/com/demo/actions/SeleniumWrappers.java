package com.demo.actions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class SeleniumWrappers extends NinjaStoreBaseClass{
	
	public void userClick(WebElement wb) {
		try {
			wb.click();
		}catch(Exception e) {
			verifyTest(false, e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void userType(WebElement wb, String value) {
		try {
			wb.sendKeys(value);
		}catch(Exception e) {
			verifyTest(false, e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void sleep(int millis) {
		try {
			Thread.sleep(millis);
		}catch(Exception e) {
			verifyTest(false, e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public void checkbox(WebElement value) {
		try {
			value.click();
		}catch(Exception e) {
			verifyTest(false, e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void verifyTest(boolean isPresent, String message) {
		try {
			if(isPresent) {
				test.log(LogStatus.PASS, message+" : "+isPresent);
			}else {
				test.log(LogStatus.FAIL, message);
			}
			Assert.assertTrue(isPresent);
		}catch(Exception e) {
			verifyTest(false, e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void verifyTest(String actualValue, String expectedValue, String message) {
		try {
			if(expectedValue.equals(actualValue)) {
				test.log(LogStatus.PASS, message+" Expected is :"+expectedValue+", Actual Value : "+actualValue);
			}else {
				test.log(LogStatus.FAIL, message+" Expected is :"+expectedValue+", Actual Value : "+actualValue);
			}
			Assert.assertEquals(actualValue, expectedValue, message+" Expected is :"+expectedValue+", Actual Value : "+actualValue );
		}catch(Exception e) {
			verifyTest(false, e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void addLog(String message) {
		try {
			test.log(LogStatus.INFO, message);
		}catch(Exception e) {
			verifyTest(false, e.getMessage());
			e.printStackTrace();
		}
	}

}
