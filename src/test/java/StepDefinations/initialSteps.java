package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class initialSteps {
	@Given("open the chrome browser")
	public void open_the_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("hello world");
	}

	@When("user Enter the specific in the search bar")
	public void user_enter_the_specific_in_the_search_bar() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("the url must open")
	public void the_url_must_open() {
		// Write code here that turns the phrase above into concrete actions
	
	}

	@And("user should be able to navigate through pages")
	public void user_should_be_able_to_navigate_through_pages() {
		// Write code here that turns the phrase above into concrete actions
		
	}
}
