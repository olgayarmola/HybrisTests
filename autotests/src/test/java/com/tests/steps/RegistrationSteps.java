package com.tests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.BasePage;
import pages.RegistrationPage;

public class RegistrationSteps extends ScenarioSteps{

    RegistrationPage registrationPage;

    @Step
    public void navigateToRegistrationPage(){ registrationPage.open(); }
    @Step
    public void selectTitle(String title){
        registrationPage.selectTitle(title);
    }
    @Step
    public void enterFirstName(String firstName){
        registrationPage.enterFirstName(firstName);
    }
    @Step
    public void enterLastName(String lastName) {registrationPage.enterLastName(lastName);}
    @Step
    public void enterEmailAddress(String email){registrationPage.enterEmail(email);}
    @Step
    public void enterPassword(String password){registrationPage.enterPassword(password);}
    @Step
    public void enterCconfirmPassword(String confirmPassword){registrationPage.confirmPassword(confirmPassword);}
    @Step
    public void submitRegistrationForm(){registrationPage.submitRegistrationForm();}
    @Step
    public void verifyThatUserIsRegistered(){registrationPage.verifyUserRegistered();}

}
