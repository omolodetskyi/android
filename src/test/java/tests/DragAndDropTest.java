package tests;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import screenObjects.CustomAdapterScreen;
import screenObjects.DragAndDropScreen;
import screenObjects.ExpListsScreen;
import screenObjects.MainScreen;
import screenObjects.ViewsScreen;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragAndDropTest extends TestBase {
	AndroidDriver driver;
	MainScreen mainScreen;
	ViewsScreen viewsScreen;
	DragAndDropScreen dragAndDropScreen;
  @Test
  public void testingDragAndDrop() {
	  mainScreen.viewsMenuItem.click(); 
	  viewsScreen.dragAndDropMenuItem.click();
	  TouchAction action=new TouchAction(driver);
	  action.longPress(longPressOptions().withElement(element(dragAndDropScreen.firstDot)))
	  .moveTo(element(dragAndDropScreen.secondDot))
	  .release()
	  .perform();
	  //driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  driver.pressKey(new KeyEvent(AndroidKey.HOME));
	
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  driver=mycapabilities();  
	  mainScreen=new MainScreen(driver);
	  viewsScreen=new ViewsScreen(driver);
	  dragAndDropScreen=new DragAndDropScreen(driver);
  }

}
