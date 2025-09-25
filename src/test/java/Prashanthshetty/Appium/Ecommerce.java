//package Prashanthshetty.Appium;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import Prashanthshetty.Appium.Framework.Android.FormPage;
//import io.appium.java_client.AppiumBy;
//
//public class Ecommerce extends BaseTest{
//	
//	
//	
//	@Test
//	//Verify the error toast message 
//
//	public void ecommerceT1() {
//		
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		String errorToastmess=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
//		Assert.assertEquals(errorToastmess, "Please enter your name");	
//		
//	}
//	@Test
//	public void ecommerceT2() throws InterruptedException {
//		
//		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
////		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).new scrollIntoView(new UiSelector().text(\"India\"));")).click();
////		
//		
//		driver.findElement(AppiumBy.androidUIAutomator(
//			    "new UiScrollable(new UiSelector().scrollable(true))" +
//			    ".scrollIntoView(new UiSelector().text(\"Aruba\"));"
//			)).click();
//		
//        FormPage formpage=new FormPage(driver);
//        
//		formpage.nameField("Prashanth");
////    	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Prashanth");
////		driver.hideKeyboard();
//		
//		formpage.maleSelectOpt();
////		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
//		
//		formpage.letShopBtn();
////		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		System.out.println("First testcase pass");
//		
//		
//	}
//	
//	@Test
//	
//	//click on the select the item and add to cart 
//	
//	public void ecommerceT3()
//	{
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+
//	".scrollIntoView(new UiSelector().text(\"Jordan 6 Rings\"));"));
//		
//
//		int elementcut=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
//		for(int i=0;i<elementcut;i++)
//		{
//			String elementname=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
//			
//			if(elementname.equalsIgnoreCase("Jordan 6 Rings")) 
//			{
//				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
//			}
//			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click(); 
//		}
//		
//	}
//}
