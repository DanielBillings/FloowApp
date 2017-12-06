package Login;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Help {
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
		
		MobileElement editEmail1 = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_email\")");
		editEmail1.click();
		editEmail1.sendKeys("test@gmail.com");
		MobileElement editPass1 = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_password\")");
		editPass1.click();
		editPass1.sendKeys("test1234");
		MobileElement editLogin1 = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/btn_login\")");
		editLogin1.click();
		
		MobileElement helpbtn = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/tab_help\")");
		helpbtn.click();
		MobileElement search = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_faq_search\")");
		search.click();
		search.sendKeys("What is the Speed Score?");
		MobileElement searchclear = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourchId(\"com.thefloow.flo:id/button_faq_search_clear\")");
		searchclear.click();
		MobileElement aboutapp = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"About the App\")");
		aboutapp.click();
		MobileElement usingapp= ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Using the App\")");
		usingapp.click();
		MobileElement scoring = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Scoring\")");
		scoring.click();
	}
	}
