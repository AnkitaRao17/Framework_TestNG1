package com.demo.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaStoreRegistrationLocaters {
	 WebDriver driver;
		
		public NinjaStoreRegistrationLocaters(WebDriver driver) {
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(id="input-firstname")
		public WebElement firstnamer;

		@FindBy(id="input-lastname")
		public WebElement lastname;
		
		@FindBy(id="input-email")
		public WebElement email;
		
		@FindBy(id="input-telephone")
		public WebElement telephone;
		
		@FindBy(id="input-password")
		public WebElement password;
		
		@FindBy(id="input-confirm")
		public WebElement confirmpassword;
			
		@FindBy(name="agree")
		public WebElement agreecheckbox; 
		
		@FindBy(xpath="//input[@class='btn btn-primary']")
		public WebElement continuebtn; 
		
}


