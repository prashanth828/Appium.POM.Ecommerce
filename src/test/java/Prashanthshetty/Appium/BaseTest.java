package Prashanthshetty.Appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest {
	
	AndroidDriver driver; 
	AppiumDriverLocalService service; 
	String scrollpath;
	int noOfScroll;
	boolean canScrollMore;
	
	
//	Methods
//	longClickGesture
//	ScrollTillText
//	numberOfScroll
//	scrollToEnd
	
	@BeforeClass
	public void appiumConfig() throws MalformedURLException, URISyntaxException {
		
//		service= new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/index.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		//AndroiDriver inoke 
		
		UiAutomator2Options options=new UiAutomator2Options(); 
		
		options.setDeviceName("293f8943");
		options.setApp("/Users/prashanth.b1/AppiumProject/Appium/src/test/java/ultilis/ApiDemos-debug.apk");
	
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723/wd/hub").toURL(), options);
		
	}
	
	//Longclickmethod 
	public void longClickGesture(WebElement longPrs) {
		
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",
				((RemoteWebElement)longPrs).getId(),"duration",2000));
	}
	
	//scrrollthePageUntillViewTheText
	
	public void ScrollTillText(String elementpath) {
	
	driver.findElement(AppiumBy.androidUIAutomator(
		    "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\""+elementpath+"\"));"
		));
	}
	
	
	public void numberOfScroll(int noOfScroll) {
        for(int i=0;i<=noOfScroll;i++) { 
	 }
        
	}
	
	public void scrollToEnd() throws InterruptedException {
        do {
        	canScrollMore=(Boolean)((JavascriptExecutor)driver).executeScript("mobile: scrollGesture",
			ImmutableMap.of("left",100,"top",100,"width",800,"height",1000,"direction","down","percent",0.8)); 
        }
        while(canScrollMore);
        Thread.sleep(3000);
	
	}

	public void tearDown() {
		
		driver.quit();
		service.stop(); 
	}

}
