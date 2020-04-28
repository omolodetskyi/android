package screenObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DragAndDropScreen {
	public DragAndDropScreen(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@AndroidFindBy(id="io.appium.android.apis:id/drag_dot_1")
public MobileElement dragDot1;
@AndroidFindBy(id="io.appium.android.apis:id/drag_dot_2")
public MobileElement dragDot2;
}
