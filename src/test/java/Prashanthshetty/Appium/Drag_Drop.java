package Prashanthshetty.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Drag_Drop extends BaseTest {
	
	@Test 
	public void dragAndDrop() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement draglc = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		//Drag and drop 
	
		((JavascriptExecutor)driver).executeScript("mobile:dragGesture",ImmutableMap.of("elementId",((RemoteWebElement)draglc).getId(),
				"endX",709,
				"endY",656
				));	
		String textontheScreen=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		Assert.assertEquals(textontheScreen, "Dropped!");
		Thread.sleep(1000);
				

		
	}

}
