package Prashanthshetty.Appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class IOSTestcases {
	
	@BeforeGroups
	public void baseTest(String[] args) throws MalformedURLException, URISyntaxException {
		
	XCUITestOptions options=new XCUITestOptions();
	options.setDeviceName("iPhone 15");
	options.setApp("/Users/prashanth.b1/AppiumProject/Appium/src/test/java/ultilis/UIKitCatalog.app/UIKitCatalog");
	options.setPlatformVersion("17.4");
	
	
	
	IOSDriver driver= new IOSDriver(new URI("http://127.0.0.1:4723/wd/hub").toURL(), options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void execution() {
	
	System.out.println("Hi");
	}
	
}
