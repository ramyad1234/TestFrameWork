package allSteps;

import java.time.Duration;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.SwagLoginPage;

public class HomePageSteps extends Base{
	
	SwagLoginPage swp;
	HomePageSteps hs;
	
	@Given("user name and password entered")
	public void user_name_and_password_entered() {
		swp = new SwagLoginPage(driver);
		hs = new HomePageSteps();
		hs.element(swp.getUserName()).sendKeys("standard_user");
		hs.element(swp.getPassword()).sendKeys("secret_sauce");
		hs.element(swp.getLoginButton()).click();
	}
	@When("user able to see the product name")
	public void user_able_to_see_the_product_name() {
	    System.out.println(hs.element(swp.getVerifyProductName1()).getText());
	}
	@Then("user can able to click on the product")
	public void user_can_able_to_click_on_the_product() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(5));
		hs.element(swp.getVerifyProductName1()).click();
	}
	
	@Given("second user name and password entered")
	public void second_user_name_and_password_entered() {
		swp = new SwagLoginPage(driver);
		hs = new HomePageSteps();
		hs.element(swp.getUserName()).sendKeys("problem_user");
		hs.element(swp.getPassword()).sendKeys("secret_sauce");
		hs.element(swp.getLoginButton()).click();
	}
	@When("user able to see the second product name")
	public void user_able_to_see_the_second_product_name() {
		System.out.println(hs.element(swp.getVerifyProductName2()).getText());
	}
	@Then("user can able to click on the second product")
	public void user_can_able_to_click_on_the_second_product() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(5));
		hs.element(swp.getVerifyProductName2()).click();
	}
}
