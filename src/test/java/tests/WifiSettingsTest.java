package tests;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import general.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screenObjects.MainScreen;
import screenObjects.PrefDependenciesScreen;
import screenObjects.PreferencesScreen;

public class WifiSettingsTest extends TestBase{
	AndroidDriver driver;
	MainScreen mainScreen;
	PreferencesScreen preferencesScreen;
	PrefDependenciesScreen prefDependenciesScreen;
  @Test
  public void testSomething() {
	  mainScreen.preferenceMenuItem.click();
	  preferencesScreen.prefDependencies.click();
	  boolean actualWifiSettingsState=false;
	  actualWifiSettingsState=prefDependenciesScreen.wifiSettingsMenuItem.isEnabled();
	  Assert.assertEquals(actualWifiSettingsState, false);
	  prefDependenciesScreen.wifiCheckbox.click();
	  actualWifiSettingsState=prefDependenciesScreen.wifiSettingsMenuItem.isEnabled();
	  Assert.assertEquals(actualWifiSettingsState, true);
	  prefDependenciesScreen.wifiSettingsMenuItem.click();
	  prefDependenciesScreen.wifiSettingsTextBox.sendKeys("password");
	  String actualText=prefDependenciesScreen.wifiSettingsTextBox.getText();
	  Assert.assertEquals(actualText, "password");
	  prefDependenciesScreen.wifiSettingsOkButton.click();
	  
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	driver=mycapabilities();  
	mainScreen=new MainScreen(driver);
	preferencesScreen=new PreferencesScreen(driver);
	prefDependenciesScreen=new PrefDependenciesScreen(driver);
  }

}
