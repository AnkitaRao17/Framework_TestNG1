package com.demo.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaStoreLoginLocators  {

	 WebDriver driver;
	
	public NinjaStoreLoginLocators(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	
	}
	@FindBy(id="input-email")
	public WebElement email_address;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]\r\n")
	public WebElement signinbtn;
	
	//a[@class='list-group-item'][contains(text(),'Edit Account')] 
	
	@FindBy(xpath="//a[@class='list-group-item'][contains(text(),'Edit Account')] ")
	public WebElement edit_account;
	
	//span[contains(text(),'My Account')]
	@FindBy(xpath="//a[@class='list-group-item'][contains(text(),'Edit Account')] ")
	public WebElement my_account;
	
	//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Logout')] 
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Logout')]")
	public WebElement logout;
	
	//p[contains(text(),'You have been logged off your account. It is now s')]
	@FindBy(xpath="	//p[contains(text(),'You have been logged off your account. It is now s')]")
	public WebElement logout_text;
	
	
}
