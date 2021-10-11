package mobile.chrome.emulator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LibertyTechnologies {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AppiumDriver<WebElement> driver;
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		//dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");   //my redmi phone version
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "My Device");
		
		dc.setCapability("udid", "emulator-5554");
		//dc.setCapability("udid", "93ecdc170803");  // redmi phone
		
		
		ChromeOptions op = new ChromeOptions();
		
		op.setExperimentalOption("androidPackage", "com.android.chrome");
		
		dc.setCapability(ChromeOptions.CAPABILITY, op);
		
		dc.setCapability("chromedriverExecutable", "D:\\selenium-workspace\\AppiumProject\\drivers\\chromedriver_emulator.exe");
		
		driver = new AppiumDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		
		driver.get("http://www.libertytestingcenter.com");
		
		driver.findElementByLinkText("Registration").click();
		
		driver.findElementByName("name").sendKeys("Surendra");
		
		
		
		
		
		
	}

}
