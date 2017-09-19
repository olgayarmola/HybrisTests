package com.tests.steps.definitions;

import com.tests.steps.ProductDetailsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductDetailsDefinitionSteps {

    @Steps
    ProductDetailsSteps productDetailsSteps;

    @When("^go to \"([^\"]*)\" product category$")
    public void goToProductCategory(String arg0) throws Throwable {
        productDetailsSteps.openCategory(arg0);
    }

    @When("^open product \"([^\"]*)\" on the page$")
    public void openProductOnThePage(String arg0) throws Throwable {
        productDetailsSteps.openProductNumber(arg0);
    }

    @When("^type \"([^\"]*)\" in the qty field$")
    public void typeInTheQtyField(String arg0) throws Throwable {
        productDetailsSteps.typeInQtyField(arg0);
    }


    @When("^click on plus button$")
    public void clickOnButton() throws Throwable {
        productDetailsSteps.incrementProductQty();
    }

    @Then("^product qty is (\\d+)$")
    public void productQtyIs(int arg0) throws Throwable {
        productDetailsSteps.verifyProductQtyIs(arg0);
    }
}
