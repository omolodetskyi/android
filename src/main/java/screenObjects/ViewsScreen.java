package screenObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewsScreen {
	public ViewsScreen(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@AndroidFindBy(xpath="//android.widget.TextView[@text='Expandable Lists']")
public MobileElement expListsMenuItem;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Date Widgets']")
public MobileElement dateWidgetsMenuItem;
@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"WebView\"))")
public MobileElement webViewMenuItem;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Drag and Drop']")
public MobileElement dragAndDropMenuItem;
}
