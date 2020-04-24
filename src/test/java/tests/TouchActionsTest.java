package tests;

import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.android.AndroidDriver;
import screenObjects.CustomAdapterScreen;
import screenObjects.ExpListsScreen;
import screenObjects.MainScreen;
import screenObjects.ViewsScreen;
import org.openqa.selenium.interactions.Actions;


import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class TouchActionsTest extends TestBase {
	AndroidDriver driver;
	MainScreen mainScreen;
	ViewsScreen viewsScreen;
	ExpListsScreen expListsScreen;
	CustomAdapterScreen custAdapterScreen;
	
  @Test
  public void menuTest() {
	 mainScreen.viewsMenuItem.click(); 
	 viewsScreen.expListsMenuItem.click();
	 expListsScreen.customAdapterMenuItem.click();
	 TouchAction touchaction=new TouchAction(driver);
	 touchaction.longPress(longPressOptions().withElement(element(custAdapterScreen.peopleNamesMenuItem)).withDuration(ofSeconds(2))).release().perform();
	 String actualMenuText=custAdapterScreen.sampleActionMenuItem.getText();
	 Assert.assertEquals(actualMenuText, "Sample action");
	 custAdapterScreen.sampleActionMenuItem.click();
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  driver=mycapabilities();  
	  mainScreen=new MainScreen(driver);
	  viewsScreen=new ViewsScreen(driver);
	  expListsScreen=new ExpListsScreen(driver);
	  custAdapterScreen=new CustomAdapterScreen(driver);
  }

}
