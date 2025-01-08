package bstackPageMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bstackPageObjects.Page_02_ProductListPageObjects;
import bstackUtilities.ExtentReporting;

public class Method_02_ProductListPagemethods{
	
	WebDriver driver;
	Page_02_ProductListPageObjects productListPageObjects;
	List<WebElement> phoneTitleList;
	
	public Method_02_ProductListPagemethods(WebDriver driver)
	{
		this.driver = driver;
		productListPageObjects = new Page_02_ProductListPageObjects(driver);
		
	}
	
	public void clickVendor()
	{
		productListPageObjects.vendor.click();
	}
	
	public boolean vendorSearchVerification() throws InterruptedException
	{
		  Thread.sleep(3000);
		  phoneTitleList = productListPageObjects.productTitles;
		  boolean result = true;
		  for(WebElement phoneTitle : phoneTitleList )
		  {
			  String phoneTitleText = phoneTitle.getText();
			  if(phoneTitleText.contains("One Plus"))
			  {
				  System.out.println("Matched");
				  result = true;
			  }
			  else
			  {
				  result = false;
				  break;
			  }
			  
		  }
		  return result;
	}
	
	public void clickAddCartButton()
	{
		productListPageObjects.addToCartButton.click();
	}
	
	public boolean checkCartProduct()
	{
		String expected = phoneTitleList.get(0).getText();
		String actual = productListPageObjects.product.getText();
	    if(expected.equals(actual))
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	}
	public void clickCheckoutButton()
	{
		productListPageObjects.checkout.click();
	}

}
