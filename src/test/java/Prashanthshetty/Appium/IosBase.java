package Prashanthshetty.Appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.BeforeTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class IosBase {
	IOSDriver driver;
	@BeforeTest
	public void baseTest() throws MalformedURLException, URISyntaxException {
	XCUITestOptions options=new XCUITestOptions();
	options.setDeviceName("iPhone 15");
	options.setApp("Users/prashanth.b1/Library/Developer/Xcode/DerivedData/UIKitCatalog-cauvtulvsvhcrseaztrjtsxbfndz/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
	options.setPlatformVersion("17.4");
	
	
	
	driver= new IOSDriver(new URI("http://127.0.0.1:4723/wd/hub").toURL(), options);
	
	}
}
