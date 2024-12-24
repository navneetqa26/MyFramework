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
  Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", signInPageMethods.doSignIn());
  }
  
  @Test(priority = 2)
  public void verifyVendorSearch() throws InterruptedException
  {
 
	  productListPagemethods.clickVendor();
	  boolean searchResult =productListPagemethods.vendorSearchVerification();
	  Assert.assertTrue(searchResult);
  }
  
  
  
  
}
