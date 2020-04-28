package screenObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class expListsScreen {
	public expListsScreen(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@AndroidFindBy(xpath="//android.widget.TextView[@text='1. Custom Adapter']")
public MobileElement custAdapterMenuItem;

}
