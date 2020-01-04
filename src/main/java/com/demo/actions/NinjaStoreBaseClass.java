package com.demo.actions;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.demo.util.InitilizeVariable;
import com.demo.util.PropertyFileReader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class NinjaStoreBaseClass {
	
	public static WebDriver driver = null;
	PropertyFileReader propertyReader = new PropertyFileReader();
	InitilizeVariable initilizeEnv = new InitilizeVariable();
	
	 public static ExtentReports reports;
	 public static ExtentTest test;
	
		@BeforeSuite
		public void initilizeReport() {
			reports = new ExtentReports(System.getProperty("user.dir")+"/reports/"+new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date()) + "reports.html");
		}
		
		@AfterSuite
		public void cleanUpReport() {
			reports.flush();
		}
	
		@BeforeMethod
		@org.testng.annotations.Parameters({"browser", "envName"})
		  public void beforeMethod (String browserName, String envName, Method method) throws InterruptedException  {
			test = reports.startTest(method.getName());
			invokeBrowser(browserName);
			initilizeEnv.setEnvName(envName);
			driver.manage().window().maximize();
			driver.get(propertyReader.getProperties("url"));
			Thread.sleep(8000);
		  }		

		@AfterMethod
		  public void afterMethod() {
			reports.endTest(test);
			 driver.close();
		 }
		
		public void invokeBrowser(String browserName) {
			
			switch(browserName) {
			
			case "chrome" :
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
				
			case "firefox" :
				System.setProperty("webdriver.gecko.driver", "E:\\New folder\\java software\\chromedriver.exe");
				driver = new FirefoxDriver();
				break;
				
			case "ie" :
				break;
				
			default: 
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			
			}
			
		}
		  
		
	}
	
			


