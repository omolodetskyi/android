package screenObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ClockScreen {
	public ClockScreen(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@AndroidFindBy(xpath="//*[@content-desc='1']")
public MobileElement oneOclock;
@AndroidFindBy(xpath="//*[@content-desc='15']")
public MobileElement fifteenMin;
@AndroidFindBy(xpath="//*[@content-desc='30']")
public MobileElement thirtyMin;
}
