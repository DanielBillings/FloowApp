package Login;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Register {
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
		
		MobileElement createaccount = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/text_view_create_account\")");
		createaccount.click();
		
		MobileElement firstName = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_first_name\")");
		firstName.click();
		MobileElement firstNametype = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_first_name\")");
		firstNametype.sendKeys("test");
		
		MobileElement Surname = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_surname\")");
		Surname.click();
		MobileElement Surnametype = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_surname\")");
		Surnametype.sendKeys("testsurname");
		
		MobileElement DOB = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_date_of_birth\")");
		DOB.click();
		MobileElement DOBcancel = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")");
		DOBcancel.click();
		MobileElement DOB1 = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_date_of_birth\")");
		DOB1.click();
		
		MobileElement increaseday = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().description(\"Increase day\")");
		increaseday.click();
		MobileElement decreaseday = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().description(\"Decrease day\")");
		decreaseday.click();
		

		MobileElement increasemonth = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().description(\"Increase month\")");
		increasemonth.click();
		MobileElement decreasemonth = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().description(\"Decrease month\")");
		decreasemonth.click();
		
		
		MobileElement increaseyear = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().description(\"Increase year\")");
		increaseyear.click();
		MobileElement decreaseyear = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().description(\"Decrease year\")");
		decreaseyear.click();
		MobileElement DOB2 = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"OK\")");
		DOB2.click();
		
		MobileElement editemail = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_email\")");
		editemail.click();
		MobileElement editemail2 = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_email\")");
		editemail2.sendKeys("tes1t@gmail.com");
		
		MobileElement editpostcode = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_postcode\")");
		editpostcode.click();
		MobileElement editpostcode2 = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_postcode\")");
		editpostcode2.sendKeys("YO24 1EG");
		
		MobileElement editcompany = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_company_name\")");
		editcompany.click();
		MobileElement editcompany2 = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_company_name\")");
		editcompany2.sendKeys("test company");
		
		MobileElement editpassword = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_password\")");
		editpassword.click();
		MobileElement editpassword2 = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_password\")");
		editpassword2.sendKeys("test1234");
		
		MobileElement editconfirmpass = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_confirm_password\")");
		editconfirmpass.click();
		MobileElement editconfirmpass2 = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.thefloow.flo:id/edit_text_confirm_password\")");
		editconfirmpass2.sendKeys("test1234");
		
		MobileElement submit = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Submit\")");
		submit.click();
	}
	}
