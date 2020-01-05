package com.demo.test;

import org.testng.annotations.Test;

import com.demo.actions.NinjaStoreLoginAction;
import com.relevantcodes.extentreports.LogStatus;
import com.demo.actions.NinjaStoreBaseClass;

public class NinjaStoreLoginTest extends NinjaStoreBaseClass  {
	
  @Test
  public void loginWithValidCredentials() throws InterruptedException {
	  
	  NinjaStoreLoginAction obj1= new NinjaStoreLoginAction();
	  obj1.amzonlogin();
  }
	/*
	 * @Test public void loginWithInvalidCredentials() throws InterruptedException {
	 * test.log(LogStatus.INFO, "hiiii");
	 * 
	 * test.log(LogStatus.INFO, "hello"); }
	 */
  
  
}
