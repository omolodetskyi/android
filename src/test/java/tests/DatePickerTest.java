package tests;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import screenObjects.ClockScreen;
import screenObjects.DateWidgetsScreen;
import screenObjects.MainScreen;
import screenObjects.PrefDependenciesScreen;
import screenObjects.PreferencesScreen;
import screenObjects.ViewsScreen;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class DatePickerTest extends TestBase{
	AndroidDriver driver;
	MainScreen mainScreen;
	ViewsScreen viewsScreen;
	DateWidgetsScreen dateWidgetsScreen;
	ClockScreen clockScreen;
  @Test
  public void datePickerTest() {
	  mainScreen.viewsMenuItem.click();
	  viewsScreen.dateWidgetsMenuItem.click();
	  dateWidgetsScreen.inlineMenuItem.click();
	  clockScreen.oneOclock.click();
	  TouchAction action=new TouchAction(driver);
	  action.longPress(longPressOptions().
			  withElement(element(clockScreen.fifteenMin))).
	          moveTo(element(clockScreen.thirtyMin)).
	          release().perform();
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	driver=mycapabilities();  
	mainScreen=new MainScreen(driver);
	viewsScreen=new ViewsScreen(driver);
	dateWidgetsScreen=new DateWidgetsScreen(driver);
	clockScreen=new ClockScreen(driver);
  }
}
