package org.example.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.API;

public class APIStepDef {

    API api = new API();

    @When("I hit {string} to {string}")
    public void hitAPI(String uri, String request) {
        api.hitAPI(uri,request);
    }

    @Then("The response contains {string}")
    public void responseValidator(String message) {
        api.validateResponse(message);
    }

}
