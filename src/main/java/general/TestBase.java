
package general;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;




public class TestBase {
 public static AndroidDriver<AndroidElement> mycapabilities() throws MalformedURLException {
	       
	        File appDir=new File("src/main/java/resources");
	        File app=new File(appDir,"app-debug.apk");
	       
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestDevice");
			//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "PSEDU17127003751"); 
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
			cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			AndroidDriver driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        return driver;  
		}

}