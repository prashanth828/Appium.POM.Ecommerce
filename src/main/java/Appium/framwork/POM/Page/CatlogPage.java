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
	
	@AndroidFindBy(id="")
	private List<WebElement> pricevalue;
	
	@AndroidFindBy(id="")
	private WebElement totalvalue;


	public void addCartBtn(int index) {
		clickAddCartBtn.get(index).click();
	}
	
	public void cartPage() {
		clickForCartPage.click();
	}
	
	public void completePurchaseCta(){
		visitWebsiteCta.click();
	}
	
	public double SumOfPrice() {
		int count = pricevalue.size();
		double sum=0.0;
		
		for(int i=0;i<count;i++) {
			String priceText=pricevalue.get(i).getText();
			double priceValue= Double.parseDouble(priceText.substring(1));
			sum=sum+priceValue;
		}
		return sum;
	}
	
	public double totalValueDisplayed() {
		String valuetxt=totalvalue.getText();
		double valueDisplayed=Double.parseDouble(valuetxt.substring(1));
		return valueDisplayed;
	}
	

}
