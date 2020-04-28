package tests;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import screenObjects.CustomAdapterScreen;
import screenObjects.MainScreen;

import screenObjects.ViewsScreen;
import screenObjects.WebViewScreen;
import screenObjects.expListsScreen;


public class ScrollTest extends TestBase{
	AndroidDriver driver;
	MainScreen mainScreen;
	ViewsScreen viewsScreen;
	WebViewScreen webViewScreen;
  @Test
  public void scrollingTest() {
	  mainScreen.viewsMenuItem.click();
	 // System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Controls\")").getText());
	  //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"WebView\"))");
	  viewsScreen.webViewMenuItem.click();
	  /*
	  Set<String> contextSet=driver.getContextHandles();
	  for(String contextName:contextSet){
		  System.out.println(contextName);
	  }
	  */
	  webViewScreen.switchToWebView(driver);
	  webViewScreen.textBox.click();
	  webViewScreen.textBox.clear();
	  webViewScreen.textBox.sendKeys("hello");
	  
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	driver=mycapabilities();  
	mainScreen=new MainScreen(driver);
	viewsScreen=new ViewsScreen(driver);
	webViewScreen=new WebViewScreen(driver);
  }
}
