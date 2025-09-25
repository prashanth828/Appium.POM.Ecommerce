package Prashanthshetty.Appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AddingThePrice {
	AndroidDriver driver;
	@BeforeClass 
	public void config() throws MalformedURLException, URISyntaxException {
	
	UiAutomator2Options option=new UiAutomator2Options();
	option.setDeviceName("293f8943");
	option.setApp("/Users/prashanth.b1/AppiumProject/Appium/src/test/java/ultilis/General-Store.apk");
	driver=new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), option);
	}
	
	
   @Test 
   public void addingThePrice() {
    	
    	//first page 
    	String HomescreenText=driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select the country where you want to shop\"]")).getText();
    	Assert.assertEquals(HomescreenText, "Select the country where you want to shop");
    	
    	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
    	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"India\"));"));
    	
    	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).click();
    	driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
    	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    	
    	//second page 
    	
    	driver.findElements(By.xpath("//android.widget.TextView[@text='ADDED TO CART']")).get(0).click();
    	
    	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click(); 
    	
    	List<WebElement> procitems=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
    	int count=procitems.size();
    	Double sum=0.0; 
    	
    	for(int i=0;i<=count;i++) {
    		String prdvalues=procitems.get(i).getText();
    		Double prdprices = Double.parseDouble(prdvalues.substring(1));
    		sum=sum+prdprices;
    		
    	}
    	String totalText=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
    	Double totalValue=Double.parseDouble(totalText.substring(1));
    	
    	Assert.assertEquals(totalValue,sum);
	}
	}

