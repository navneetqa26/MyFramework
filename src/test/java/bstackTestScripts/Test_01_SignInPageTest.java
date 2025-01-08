package bstackTestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import bstackBase.BaseClass;

public class Test_01_SignInPageTest extends BaseClass{
  @Test(priority = 0)
  public void verifySigninPageTitle() 
  {
	  Assert.assertEquals("StackDemo", signInPageMethods.getPageTitle());
	  
  }
  
  @Test(priority = 1)
  public void verifySignIn() throws InterruptedException
  {
  Assert.assertEquals("https://bstackdemo.com/?signin=true", signInPageMethods.doSignIn());
  }
  
  @Test(priority = 2)
  public void verifyVendorSearch() throws InterruptedException
  {
      Thread.sleep(5000);
	  productListPagemethods.clickVendor();
	  boolean searchResult =productListPagemethods.vendorSearchVerification();
	  Assert.assertTrue(searchResult);
  }
  
  @Test(priority = 3)
  public void verifyCart() throws InterruptedException
  {
	  Thread.sleep(3000);
	  productListPagemethods.clickAddCartButton();
	  Thread.sleep(3000);
	  boolean cartCheck = productListPagemethods.checkCartProduct();
	  Assert.assertTrue(cartCheck);
	  
  }
  
  @Test(priority = 4)
  public void checkoutCart() throws InterruptedException
  {
	  Thread.sleep(5000);
	 productListPagemethods.clickCheckoutButton();
	  
  }
  
  @Test(priority = 5)
  public void verifyShippingPage() throws InterruptedException
  {
	  Thread.sleep(5000);
	 Assert.assertTrue(shippingDetailsMethods.verifyShippingDetailsPageURL());
	  
  }
  
  
  
  
}
