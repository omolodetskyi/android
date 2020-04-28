package screenObjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WebView {
	public WebView(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@FindBy(id="i_am_a_textbox")
public MobileElement textBox;
public void switchToWebView(AppiumDriver driver){
	driver.context("WEBVIEW_io.appium.android.apis");
}
public void switchToNativeApp(AppiumDriver driver){
	driver.context("NATIVE_APP");
}
}
