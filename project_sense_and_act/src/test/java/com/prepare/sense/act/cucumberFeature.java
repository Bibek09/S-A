package com.prepare.sense.act;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class cucumberFeature {
	
	@Steps
	cucumberStep cucumberstep;
	
	@Given("^user is on google home page$")
	public void user_is_on_google_home_page() throws Throwable {
		cucumberstep.LaunchApplication();
	}

	@When("^search an item FinTech$")
	public void search_an_item_FinTech() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		cucumberstep.search_an_item();
	}

	@Then("^results will be displayed$")
	public void results_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		cucumberstep.results();
	}
}
