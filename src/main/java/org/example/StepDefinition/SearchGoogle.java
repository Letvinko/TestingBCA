package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SearchGooglePages;

public class SearchGoogle {

    public static SearchGooglePages searchGooglePages = new SearchGooglePages();

    public SearchGoogle() {
    }

    @Given("I Open Google")
    public void accessBrowser() {
        searchGooglePages.goToGoogle();
    }

    @When("I Search {string} on search bar")
    public void searchingWithKeyword(String keyword){
        searchGooglePages.searching(keyword);
    }

    @Then("I see {string} keyword in search results")
    public void validateResult(String keyword){
        searchGooglePages.validateSearchResults(keyword);
    }

    @And("I quit browser")
    public void quitBrowser(){
        searchGooglePages.quitDriver();
    }

}
