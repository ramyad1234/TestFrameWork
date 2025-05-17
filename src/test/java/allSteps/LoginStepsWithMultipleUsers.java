package allSteps;

import java.time.Duration;

import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.SwagLoginPage;

public class LoginStepsWithMultipleUsers extends Base{
	
	SwagLoginPage swp;
	LoginStepsWithMultipleUsers ls;
	
	@Given("user have the username with multiple users")
	public void user_have_the_username_with_multiple_users() {
		swp = new SwagLoginPage(driver);
		ls = new LoginStepsWithMultipleUsers();
		System.out.println("user have the username");
	}
	@Given("user have the password and login button with multiple users")
	public void user_have_the_password_and_login_button_with_multiple_users() {
		System.out.println("user have the password and login button");
	}
	@When("the user enters username as {string} and password as {string}")
	public void the_user_enters_username_as_and_password_as(String username, String password) throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(3));
		ls.element(swp.getUserName()).sendKeys(username);
		ls.element(swp.getPassword()).sendKeys(password);
		ls.element(swp.getLoginButton()).click();
	}
	@Then("clicked on the login button and verifies that all users successfully logged in")
	public void clicked_on_the_login_button_and_verifies_that_all_users_successfully_logged_in() {
		Assert.assertEquals(ls.element(swp.getVerificatioText()).getText(), "Products");
	    System.out.println("User logged successfully");
	}
	
	@Then("user can able to see the product name")
	public void user_can_able_to_see_the_product_name() {
		swp = new SwagLoginPage(driver);
		ls = new LoginStepsWithMultipleUsers();
	    System.out.println(ls.element(swp.getVerifyUserName()).getText());
	}

}
