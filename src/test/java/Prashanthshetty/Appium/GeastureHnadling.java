package Prashanthshetty.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class GeastureHnadling extends BaseTest{
	@Test
	public void longClick() {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();   
		
		WebElement longPrs = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));	
		
		longClickGesture(longPrs); //Calling longclick menthod
		
		String menutxt=driver.findElement(By.name("Sample menu")).getText();
		Assert.assertEquals(menutxt, "Sample menu"); //validate the field 
		//or
		Assert.assertTrue(driver.findElement(By.name("Sample menu")).isDisplayed()); ////validate the field 
		
	}
	

}

//android.widget.TextView[@content-desc="Expandable Lists"]