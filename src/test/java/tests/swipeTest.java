package tests;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import screenObjects.ClockScreen;
import screenObjects.CustomAdapterScreen;
import screenObjects.DateWidgetScreen;
import screenObjects.ExpListsScreen;
import screenObjects.MainScreen;
import screenObjects.ViewsScreen;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class swipeTest extends TestBase {
	AndroidDriver driver;
	MainScreen mainScreen;
	DateWidgetScreen dateWidgetScreen;
	ViewsScreen viewsScreen;
	ClockScreen clockScreen;
  @Test
  public void swipeTesting() {
	  mainScreen.viewsMenuItem.click();
	  viewsScreen.dateWidgetsMenuItem.click();
	  dateWidgetScreen.inlineMenuItem.click();
	  clockScreen.oneOclock.click();
	  TouchAction touchaction=new TouchAction(driver);
	  touchaction.longPress(longPressOptions().withElement(element(clockScreen.fifteenMinutes))).moveTo(element(clockScreen.thirtyMinutes)).release().perform();  }
@BeforeTest
public void beforeTest() throws MalformedURLException {
	  driver=mycapabilities();  
	  mainScreen=new MainScreen(driver);
	  dateWidgetScreen=new DateWidgetScreen(driver);
	  clockScreen=new ClockScreen(driver);
	  viewsScreen=new ViewsScreen(driver);
}
}
