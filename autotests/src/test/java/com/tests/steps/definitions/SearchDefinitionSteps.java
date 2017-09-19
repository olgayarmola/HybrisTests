package com.tests.steps.definitions;

import com.tests.steps.SearchSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;


public class SearchDefinitionSteps {
    @Steps
    SearchSteps steps;

    @Given("^open storefront$")
    public void openStorefront() throws Throwable {
        steps.openStorefront();
    }

    @When("^type \"([^\"]*)\" in the search field$")
    public void typeInTheSearchField(String arg0) throws Throwable {
        steps.enterKeywords(arg0);
    }

    @Then("^user see suggestion box$")
    public void userSeeSuggestionBox() throws Throwable {
        steps.checkSearchSuggestionIsShown();
    }

    @When("^click on search button$")
    public void clickOnSearchButton() throws Throwable {
        steps.clickOnSearchButton();
    }

    @Then("^search results page is loaded for \"([^\"]*)\"$")
    public void searchResultsPageIsLoadedFor(String arg0) throws Throwable {
        steps.checkSearchResults(arg0);
    }
}
