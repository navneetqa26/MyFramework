package bstackPageMethods;

import org.openqa.selenium.WebDriver;

import bstackPageObjects.Page_01_SignInPageObjects;

public class Method_01_SignInPageMethods {
	
	WebDriver driver;
	
	Page_01_SignInPageObjects signInPageObjects;
	
	public Method_01_SignInPageMethods(WebDriver driver)
	{
		this.driver = driver;
		signInPageObjects = new Page_01_SignInPageObjects(driver);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public String doSignIn() throws InterruptedException
	{
		signInPageObjects.userNameSelection.click();
		signInPageObjects.userName.click();
		signInPageObjects.passwordSelection.click();
		signInPageObjects.password.click();
		signInPageObjects.submitBtn.click();
		Thread.sleep(3000);
		String URLAfterSignIn = driver.getCurrentUrl();
		return URLAfterSignIn;
		
	}
	

}
