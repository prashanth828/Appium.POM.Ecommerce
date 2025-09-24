package Appium.framwork.POM.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import Appium.device.Actions.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FormPage extends AndroidActions {
	AndroidDriver driver;
	
	public FormPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement yourName;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement femaleBtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement maleBtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement countryField; 
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement shopBtn;
	
	

	public void setNameField(String name) {
		yourName.sendKeys(name);
		driver.hideKeyboard();
	}

	public void genderSelection(String genderselect) {
		if(genderselect.contains("male")) {
			maleBtn.click();
		}
		else {
			femaleBtn.click();
		}		
	}
	
	public void countrySelection(String countryname) {
		countryField.click();
		selectcountry(countryname);
//		driver.findElement(By.xpath("//android.widget.TextView[@text=''+countrtname+'']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='" + countryname + "']")).click();

			
	}
	
	public CatlogPage shopButton() {
		shopBtn.click();
		return new CatlogPage(driver);
	}
}
