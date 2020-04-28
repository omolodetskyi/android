package tests;

import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import screenObjects.expListsScreen;
import screenObjects.CustomAdapterScreen;
import screenObjects.MainScreen;
import screenObjects.ViewsScreen;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TouchActionsTest extends TestBase {
	AndroidDriver driver;
	MainScreen mainScreen;
	ViewsScreen viewsScreen;
	expListsScreen expListScreen;
	CustomAdapterScreen customAdapterScreen;
  @Test
  public void actionTest() {
	  mainScreen.viewsMenuItem.click();
	  viewsScreen.expListsMenuItem.click();
	  expListScreen.custAdapterMenuItem.click();
	  TouchAction action=new TouchAction(driver);
	  action.longPress(longPressOptions().
			  withElement(element(customAdapterScreen.peopleNamesMenuItem)).
			  withDuration(ofSeconds(2))).release().perform();
	  String actualMenuText=customAdapterScreen.sampleActionMenuItem.getText();
	  Assert.assertEquals(actualMenuText, "Sample action");
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	driver=mycapabilities();  
	mainScreen=new MainScreen(driver);
	viewsScreen=new ViewsScreen(driver);
	expListScreen=new expListsScreen(driver);
	customAdapterScreen=new CustomAdapterScreen(driver);
  }


}
