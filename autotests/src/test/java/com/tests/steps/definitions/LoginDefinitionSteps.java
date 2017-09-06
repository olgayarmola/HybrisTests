package com.tests.steps.definitions;

import com.tests.steps.LoginSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitionSteps {

    @Steps
    LoginSteps steps;

    @Given("^open \"([^\"]*)\" page$")
    public void openPage(String arg0) throws Throwable {
        steps.navigateToStorefront();
        steps.navigateToSignInPage();
    }


    @When("^enter \"([^\"]*)\" in the E-mail address field$")
    public void enterInTheEMailAddressField(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        steps.enterLoginEmail(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Password field$")
    public void enterInThePasswordField(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        steps.enterPassword(arg0);
    }

    @When("^click on the login button$")
    public void clickOnTheLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        steps.clickLoginButton();
    }

    @Then("^the user is logged in$")
    public void theUserIsLoggedIn() throws Throwable {
        steps.verifyUserIsLoggedIn();
    }
}
