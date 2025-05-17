package allSteps;

import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.SwagLoginPage;

public class LoginSteps extends Base{
	
	SwagLoginPage swp;
	LoginSteps ls;
	
	@Given("user have the username")
	public void user_have_the_username() {
		swp = new SwagLoginPage(driver);
		ls = new LoginSteps();
		System.out.println("user have the username");
	}
	@Given("user have the password and login button")
	public void user_have_the_password_and_login_button() {
		System.out.println("user have the password and login button");
		
	}
	@When("user enters username as standard_user and password as secret_sauce")
	public void user_enters_username_as_standard_user_and_password_as_secret_sauce() {
		ls.element(swp.getUserName()).sendKeys("standard_user");
		ls.element(swp.getPassword()).sendKeys("secret_sauce");
		ls.element(swp.getLoginButton()).click();
	}
	@Then("clicked on the login button and verifies the user successfully logged in")
	public void clicked_on_the_login_button_and_verifies_the_user_successfully_logged_in() {
	    Assert.assertEquals(ls.element(swp.getVerificatioText()).getText(), "Products");
	    System.out.println("User logged successfully");
	}
}
