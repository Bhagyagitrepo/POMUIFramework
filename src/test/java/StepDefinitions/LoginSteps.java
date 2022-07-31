package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User inside login page");
//		 throw new io.cucumber.java.PendingException();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters username ");
//		 throw new io.cucumber.java.PendingException();
	}

	@And("click on the login button")
	public void click_on_the_login_button() {
		System.out.println("User clicm on login button");
//		 throw new io.cucumber.java.PendingException();
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
		System.out.println("User navigates to Home page");
//		 throw new io.cucumber.java.PendingException();
	}

}
