package Appium.framwork.POM.Page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Appium.device.Actions.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CatlogPage extends AndroidActions {
	AndroidDriver driver;
	
	public CatlogPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='ADD TO CART']"))
    private List<WebElement> clickAddCartBtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart") 	
	private WebElement clickForCartPage;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
	private WebElement visitWebsiteCta;


	public void addCartBtn() {
		clickAddCartBtn.get(0).click();
	}
	
	public void cartPage() {
		clickForCartPage.click();
	}
	
	public void completePurchaseCta(){
		visitWebsiteCta.click();
	}
	

}
