package com.eBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class baseClass {
	
	public static WebDriver driver;
	
	String baseURL="http://demo.guru99.com/V4/";
	String usrName="mngr260343";
	String pwd="AvunAhy";
	public static Logger logger;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("log4j.properties");
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
