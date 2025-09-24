package Prashanthshetty.Appium;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


public class AppiumTet extends BaseTest  {
	
	@Test 
	public void appiumTest()  {
		
	
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).click();
		String alertText= driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertText, "WiFi settings");
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Prashanth"); 
		driver.findElement(By.id("android:id/button1"));  

		

		//android:id/alertTitle

	}
}

	