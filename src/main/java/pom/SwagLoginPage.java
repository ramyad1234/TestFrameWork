package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLoginPage {
	WebDriver driver;
	
	public SwagLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login-button")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[text()='Products']")
	private WebElement verificatioText;
	
	@FindBy(xpath = "//div[text()='standard_user']")
	private WebElement verifyUserName;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Backpac']")
	private WebElement verifyProductName1;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Ligh']")
	private WebElement verifyProductName2;

	public WebElement getVerifyUserName() {
		return verifyUserName;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getVerifyProductName1() {
		return verifyProductName1;
	}

	public WebElement getVerifyProductName2() {
		return verifyProductName2;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getVerificatioText() {
		return verificatioText;
	}
	
	
}
