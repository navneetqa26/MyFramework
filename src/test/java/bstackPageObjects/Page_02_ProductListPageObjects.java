package bstackPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_02_ProductListPageObjects {
	
	public Page_02_ProductListPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public @FindBy(xpath="/html/body/div/div/div/main/div[1]/div[4]/label/span")
	WebElement vendor;

	
	public @FindBy(className="shelf-item__title")
	List<WebElement> productTitles;
	
	public @FindBy(xpath="//*[@id=\"20\"]/div[4]")
	WebElement addToCartButton;
	
	public @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div/div[3]/p[1]")
	WebElement product;
	
	public @FindBy(xpath="/html/body/div/div/div/div[2]/div[2]/div[3]/div[3]")
	WebElement checkout;
	
	
	

	

}
