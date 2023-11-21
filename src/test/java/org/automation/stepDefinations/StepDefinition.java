package org.automation.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {
    @Given("User is on NetLanding landing page")
    public void user_is_on_net_landing_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is navigating to URL");

    }

    @When("User login into application with {string} and {string}")
    public void userLoginIntoApplicationWithAnd(String arg0, String arg1) {
        System.out.println("User login with parameters " + arg0 + " " + arg1);
    }

    @Then("Home page is populated")
    public void home_page_is_populated() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is Home Populated");
    }

    @And("Cards displayed are {string}")
    public void cardsDisplayedAre(String arg0) {
        System.out.println("This is where cards are displayed" + arg0);

    }
}
