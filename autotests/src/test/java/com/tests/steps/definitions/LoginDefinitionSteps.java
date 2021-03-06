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

    @Given("^open login page$")
    public void openLoginPage() throws Throwable {
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


    @When("^click on the Sign Out link$")
    public void clickOnTheSignOutLink() throws Throwable {
        steps.clickSignOutLink();
    }

    @Given("^user with email \"([^\"]*)\" and password \"([^\"]*)\" logged in on any page$")
    public void userWithEmailAndPasswordLoggedInOnAnyPage(String arg0, String arg1) throws Throwable {
        steps.navigateToStorefront();
        steps.navigateToSignInPage();
        steps.enterLoginEmail(arg0);
        steps.enterPassword(arg1);
        steps.clickLoginButton();
    }

    @Then("^user is logged out$")
    public void userIsLoggedOut() throws Throwable {
        steps.verifyUserIsLoggedOut();
    }

    @When("^click on the forgot password link$")
    public void clickOnTheForgotPasswordLink() throws Throwable {
        steps.clickForgotPasswordLink();
    }

    @Then("^the reset password popup is shown$")
    public void theResetPasswordPopupIsShown() throws Throwable {
        steps.verifyResetPasswordPopupIsShown();
    }
}
