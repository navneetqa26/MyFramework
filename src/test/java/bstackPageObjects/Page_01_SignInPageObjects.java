package bstackPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_01_SignInPageObjects {
	
	public Page_01_SignInPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public @FindBy(xpath="//*[@id=\"username\"]/div/div[1]/div[1]")
	WebElement userNameSelection;
	
	public @FindBy(xpath="//*[@id=\"react-select-2-option-0-0\"]")
	WebElement userName;
	
	public @FindBy(xpath="//*[@id=\"password\"]/div/div[1]/div[1]")
	WebElement passwordSelection;
	
	public @FindBy(xpath="//*[@id=\"react-select-3-option-0-0\"]")
	WebElement password;
	
	public @FindBy(id="login-btn")
	WebElement submitBtn;
	
	
	

}
