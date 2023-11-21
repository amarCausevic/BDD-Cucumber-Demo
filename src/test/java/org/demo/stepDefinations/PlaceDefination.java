package org.demo.stepDefinations;

import actions.SpecBuilderActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import main.SpecBuilders;
import model.AddPlaceResponseModel;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class PlaceDefination extends SpecBuilders {
    public static Response response = addPlace();
    @Given("Add Place Payload")
    public AddPlaceResponseModel addPlacePayload() {
        JsonPath body = response.body().jsonPath();

        return body.getObject("", AddPlaceResponseModel.class);
    }

    @When("User calls {string} with POST crud method request")
    public void userCallsWithPOSTCrudMethodRequest(String arg0) {
        Assert.assertNotNull(addPlacePayload());
    }

    @Then("The API call is success with status code {int}")
    public void theAPICallIsSuccessWithStatusCode(int arg0) {
        Assert.assertEquals(arg0,addPlace().getStatusCode());
    }

    @And("status in response body is {string}")
    public void inResponseStatusBodyIs(String arg0) {
        Assert.assertEquals(arg0, addPlacePayload().getStatus());
    }
    @And("scope in response body is {string}")
    public void inResponseScopeBodyIs(String arg0) {
        Assert.assertEquals(arg0, addPlacePayload().getScope());
    }
}
