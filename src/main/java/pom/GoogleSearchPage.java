package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="APjFqb")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	
	
	
	
}
