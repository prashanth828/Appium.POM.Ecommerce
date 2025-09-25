package Prashanthshetty.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Swipemecanism extends BaseTest {
	@Test
	public void swipeTheElement() throws InterruptedException {
		
		
	
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Gallery\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
		WebElement swipePath=driver.findElement(By.xpath("//android.widget.ImageView[1]"));
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),"true");
		
		//swipe  
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		        "elementId", ((RemoteWebElement) swipePath).getId(),
		        "direction", "left",
		        "percent", 0.9
		    ));		
				Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),"false");
		        Thread.sleep(3000); 
	}

}
