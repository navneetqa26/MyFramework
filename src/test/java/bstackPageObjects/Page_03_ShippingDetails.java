package bstackPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_03_ShippingDetails {
	
	public Page_03_ShippingDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public @FindBy(id="firstNameInput")
	WebElement firstName;
	
	public @FindBy(id="lastNameInput")
	WebElement lastName;
	
	public @FindBy(id="addressLine1Input")
	WebElement address;
	
	public @FindBy(id="provinceInput")
	WebElement province;
	
	public @FindBy(id="postCodeInput")
	WebElement postCode;
	
	public @FindBy(id="checkout-shipping-continue")
	WebElement submitButton;
	
	
	
	
	

}
