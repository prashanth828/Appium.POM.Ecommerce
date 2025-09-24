package Appium.framework.POM.Test;



import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	AndroidDriver driver;
	@BeforeClass 
	public void driverinitalize() throws MalformedURLException, URISyntaxException {
	
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("293f8943");
	options.setApp("/Users/prashanth.b1/git/repository/Appium/src/test/java/ultilis/General-Store.apk"); 
	
	 driver=new AndroidDriver(new URI("http://127.0.0.1:4723/wd/hub").toURL(), options);

}
}