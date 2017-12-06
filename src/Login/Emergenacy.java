package Login;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Emergenacy {
	public static void main(String[] args) throws MalformedURLException {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "F6SOSOUWBIKBCYRW"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.0.1");
		caps.setCapability("appPackage", "com.thefloow.flo");
		caps.setCapability("appActivity", "com.thefloow.flo.activity.LauncherActivity");
		caps.setCapability("noReset", "true");
		
		AppiumDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
		MobileElement start = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/btn_start\")");
		start.click();
		MobileElement cancel = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/btn_cancel_gps\")");
		cancel.click();
		
		MobileElement emergenacybtn = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"EMERGENCY\")");
		emergenacybtn.click();
		MobileElement breakdown = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Breakdown\")");
		breakdown.click();
		
	}
	}
