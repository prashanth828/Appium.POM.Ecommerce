package Prashanthshetty.Appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class EndToEndEcom {
	AndroidDriver driver;
	@BeforeClass 
	public void config() throws MalformedURLException, URISyntaxException {
	
	UiAutomator2Options option=new UiAutomator2Options();
	option.setDeviceName("293f8943");
	option.setApp("/Users/prashanth.b1/AppiumProject/Appium/src/test/java/ultilis/General-Store.apk");
	driver=new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), option);
	}
	
	
    @org.testng.annotations.Test
	public void Test() {
    	
    	//first page 
    	String HomescreenText=driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select the country where you want to shop\"]")).getText();
    	Assert.assertEquals(HomescreenText, "Select the country where you want to shop");
    	
    	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
    	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"India\"));"));
    	
    	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).click();
    	driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
    	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    	
    	//second page 
    	
    	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Jordan\"));"));
    	
    	int prdCount=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
    	 for(int i=0;i<=prdCount;i++)
    	 {
    		String prdName= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
    		
    		if(prdName.equalsIgnoreCase("Jordan"))
    		{
    			driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
    			break;
    			
    		}
    	 }
    	 driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
    	 
    	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
    	 wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
    	 
    	 String cartPrdName=driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
    	 Assert.assertEquals(cartPrdName, "Jordan");
	
	}
	}


