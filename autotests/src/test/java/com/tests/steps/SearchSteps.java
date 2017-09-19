package com.tests.steps;

import com.tests.pages.BasePage;
import com.tests.pages.SearchResultsPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps{

    BasePage basePage;
    SearchResultsPage searchResultsPage;

    public void openStorefront(){
        basePage.open();
    }

    public void enterKeywords(String keywords){
        basePage.enterInTheSearch(keywords);
    }

    public void checkSearchSuggestionIsShown(){
        Assert.assertTrue(basePage.searchAutocompleteBoxIsShown());

    }

    public void clickOnSearchButton() {
        basePage.clickOnSearchButton();
    }

    public void checkSearchResults(String searchQuery) {
        searchResultsPage.checkURL();
        searchResultsPage.checkTitle(searchQuery);
        searchResultsPage.checkProductsListShown();
    }
}
