package com.eBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBanking.pageObjects.LoginPage;

public class TC_Login_001 extends baseClass{
  @Test
  public void loginTest() {
	  
	  driver.get(baseURL);
	  
	  logger.info("URL opened");
	  
	  LoginPage lp = new LoginPage(driver);
	  
	  lp.setUsrName(usrName);
	  logger.info("Enetered user name");
	  lp.setPassword(pwd);
	  logger.info("password entered");
	  lp.clickSubmit();
	  
	  
	  if (driver.getTitle().equals("Guru99 Bank Manager HomePage123"))
	  {
		  Assert.assertTrue(true);
		  logger.info("testcase is passed");
	  }
	  else
	  {
		  Assert.assertTrue(false);
		  logger.info("testcase failed");
	  }
  }
  
  
}
