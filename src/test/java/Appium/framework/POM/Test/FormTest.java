package Appium.framework.POM.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Appium.framwork.POM.Page.CatlogPage;
import Appium.framwork.POM.Page.FormPage;


public class FormTest extends BaseTest 

{
	@Test
	public void ecommerceFormPage(){
	{
		FormPage formPage=new FormPage(driver);
		formPage.setNameField("Prashanth");//enter the input for name field
		formPage.genderSelection("Female"); //select the gender 
		formPage.countrySelection("Benin");//click on the country field, scroll to the Benin country and click 
		CatlogPage prdcatlog=formPage.shopButton();//click on shop button 
		
		prdcatlog.addCartBtn(0);//add the first item to the cart 
		prdcatlog.addCartBtn(0);//add the second item to the cart 
		double productTotalPrice=prdcatlog.SumOfPrice();//get the price values and sum it 
		System.out.println("The sum of product price is"+productTotalPrice);//Display the sum value 
		prdcatlog.cartPage();//navigate to cartpage 
		double totalPriceDisplayed=prdcatlog.totalValueDisplayed();//get the total price displayed 
		System.out.println("The sum of product price is"+totalPriceDisplayed);//display the total price
		Assert.assertEquals(totalPriceDisplayed, productTotalPrice);//check both the values are matching 
		prdcatlog.completePurchaseCta();//click on the shop now button 
		
	}
	}
	
}
