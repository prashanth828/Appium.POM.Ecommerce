package Appium.device.Actions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions {
	AndroidDriver driver;
	
	public AndroidActions(AndroidDriver driver) {
		this.driver=driver;
		
	}
	
	public void selectcountry(String element) 
	{
		
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true))"
			    + ".scrollIntoView(new UiSelector().text(\"" + element + "\"))"
			));
		
	}

}

