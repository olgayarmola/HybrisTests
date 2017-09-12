package com.tests.steps.definitions;

import com.tests.steps.RegistrationSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistrationDefinitionSteps {

    @Steps
    RegistrationSteps steps;

    @Given("^open registration page$")
    public void openRegistrationPage() throws Throwable {
        steps.navigateToRegistrationPage();
    }


    @When("^select \"([^\"]*)\" title in the Title dropdown$")
    public void selectTitleInTheTitleDropdown(String arg0) throws Throwable {
        steps.selectTitle(arg0);
    }

    @When("^enter first name \"([^\"]*)\" in the First Name field$")
    public void enterFirstNameInTheFirstNameField(String arg0) throws Throwable {
        steps.enterFirstName(arg0);
    }

    @When("^enter last name \"([^\"]*)\" in the Last Name field$")
    public void enterLastNameInTheLastNameField(String arg0) throws Throwable {
        steps.enterLastName(arg0);
    }

    @When("^enter e-mail \"([^\"]*)\" in the Email Address field$")
    public void enterEMailInTheEmailAddressField(String arg0) throws Throwable {
        steps.enterEmailAddress(arg0);
    }

    @When("^enter password \"([^\"]*)\" in the Password filed$")
    public void enterPasswordInThePasswordFiled(String arg0) throws Throwable {
        steps.enterPassword(arg0);
    }

    @When("^confirm password \"([^\"]*)\" in the Confirm Password field$")
    public void confirmPasswordInTheConfirmPasswordField(String arg0) throws Throwable {
       steps.enterCconfirmPassword(arg0);
    }

    @When("^click on the Register button$")
    public void clickOnTheRegisterButton() throws Throwable {
        steps.submitRegistrationForm();
    }

    @Then("^user is registered$")
    public void userIsRegistered() throws Throwable {
        steps.verifyThatUserIsRegistered();
    }


}
