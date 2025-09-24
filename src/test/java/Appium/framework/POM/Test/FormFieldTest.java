package Appium.framework.POM.Test;

import org.testng.annotations.Test;

import Appium.framwork.POM.Page.CatlogPage;
import Appium.framwork.POM.Page.FormPage;


public class FormFieldTest extends BaseTest 

{
	@Test
	public void ecommerceFormPage(){
	{
		FormPage formPage=new FormPage(driver);
		formPage.setNameField("Prashanth");
		formPage.genderSelection("Female");
		formPage.countrySelection("Benin");
		CatlogPage prdcatlog=formPage.shopButton();
		
		prdcatlog.addCartBtn(0);
		prdcatlog.addCartBtn(0);
		prdcatlog.cartPage();
		prdcatlog.completePurchaseCta();
		
	}
	}
	
}
