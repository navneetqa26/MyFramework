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
	
	public @FindBy(xpath="//*[@id=\"__next\"]/div/div/main/div[1]/div[4]/label/span")
	WebElement vendor;
	
	public @FindBy(className="shelf-item__title")
	List<WebElement> productTitles;
	

	

}
