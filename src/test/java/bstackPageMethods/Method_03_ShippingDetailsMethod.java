package bstackPageMethods;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import bstackPageObjects.Page_02_ProductListPageObjects;
import bstackPageObjects.Page_03_ShippingDetails;

public class Method_03_ShippingDetailsMethod {
	
	WebDriver driver;
	Page_03_ShippingDetails shippingDetailsObject;
	
	public Method_03_ShippingDetailsMethod(WebDriver driver)
	{
		this.driver = driver;
		shippingDetailsObject = new Page_03_ShippingDetails(driver);
	}
	
	
	public boolean verifyShippingDetailsPageURL()
	{
		boolean result = true;
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://bstackdemo.com/checkout";
		if(actualURL.equalsIgnoreCase(expectedURL))
		{
			return result;
					
		}
		else
		{
			result = false;
			return result;
		}
		
	}
	
	

}
