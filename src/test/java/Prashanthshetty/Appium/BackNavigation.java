package Prashanthshetty.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BackNavigation extends BaseTest {
	@Test 
	public void practiceMethods() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).click();
		//clipboard 
		driver.setClipboardText("clipboardtest");
		driver.findElement(By.className("android.widget.EditText")).sendKeys(driver.getClipboardText()); 
		Thread.sleep(2000);
		//Landscape
		DeviceRotation landscape=new DeviceRotation(0,0,90);
		driver.rotate(landscape); 
		Thread.sleep(2000);
		//devicenavigation 
		driver.rotate(landscape); 
		driver.pressKey(new KeyEvent(AndroidKey.HOME));  
		
		
	}

}
