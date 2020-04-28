package tests;

import java.net.MalformedURLException;
import java.util.Set;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.android.AndroidDriver;
import screenObjects.CustomAdapterScreen;
import screenObjects.ExpListsScreen;
import screenObjects.MainScreen;
import screenObjects.ViewsScreen;
import screenObjects.WebView;

public class ScrollTest extends TestBase {
	AndroidDriver driver;
	MainScreen mainScreen;
	ViewsScreen viewsScreen;
	WebView webViewScreen;
  @Test
  public void scrollingTest() {
	  mainScreen.viewsMenuItem.click(); 
	  /*
	  System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Controls\")").getText());
	  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
	  		+ ".scrollIntoView(new UiSelector().text(\"WebView\"))");
	  		*/
	  viewsScreen.webViewMenuItem.click();
	  webViewScreen.switchToWebView(driver); 
	  /*
	  Set<String> contextSet=driver.getContextHandles();
	  for(String contextName:contextSet){
		  System.out.println(contextName);
	  }
	    NATIVE_APP
        WEBVIEW_io.appium.android.apis
	   */
	  webViewScreen.textBox.click();
	  webViewScreen.textBox.clear();
	  webViewScreen.textBox.sendKeys("hello");
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  driver=mycapabilities();  
	  mainScreen=new MainScreen(driver);
	  viewsScreen=new ViewsScreen(driver);
	  webViewScreen=new WebView(driver);
  }
}
