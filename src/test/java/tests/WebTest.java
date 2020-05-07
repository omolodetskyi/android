package tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.TestBaseWeb;
import io.appium.java_client.android.AndroidDriver;
import screenObjects.LoginPage;
import screenObjects.SecureAreaPage;
import screenObjects.WelcomePage;
import screenObjects.DragAndDropScreen;
import screenObjects.MainScreen;
import screenObjects.ViewsScreen;

public class WebTest extends TestBaseWeb{
	AndroidDriver driver;
	WelcomePage welcomePage;
	LoginPage loginPage;
	SecureAreaPage secureAreaPage;
	
  @Test
  public void f() {
	  welcomePage=new WelcomePage(driver);
	  welcomePage.openPage();
	 
	  String actualWelcomeTitle=welcomePage.getTitle();
	  String expectedWelcomeTitle="Available Examples";
	  
	  Assert.assertEquals(actualWelcomeTitle, expectedWelcomeTitle);
	  
	  loginPage=welcomePage.clickFormAuthenticationLink();
	  String actualLoginTitle=loginPage.getTitle();
	  String expectedLoginTitle="Login Page";
	 
	  Assert.assertEquals(actualLoginTitle, expectedLoginTitle);
	 
	  secureAreaPage=loginPage.enterUserNamePassword("tomsmith", "SuperSecretPassword!");
	  String actualSecureAreaPageTitle=secureAreaPage.getTitle();
	 
	  String expectedSecureAreaPageTitle="Secure Area";
	  Assert.assertEquals(actualSecureAreaPageTitle, expectedSecureAreaPageTitle);
	  String actualSecureAreaPageMsg=secureAreaPage.getMessage();
	  String expectedSecureAreaPageMsg="You logged into a secure area!";
	  
	  Assert.assertEquals(actualSecureAreaPageMsg.contains(expectedSecureAreaPageMsg),true);
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  driver=mycapabilities();  
  }
}
