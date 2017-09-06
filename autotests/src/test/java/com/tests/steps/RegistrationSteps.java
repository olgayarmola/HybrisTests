package com.tests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.BasePage;
import pages.RegistrationPage;

public class RegistrationSteps extends ScenarioSteps{

    RegistrationPage registrationPage;
    BasePage basePage;

    @Step
    public void navigateToRegistrationPage(){
        basePage.navigateToSignInPage();
    }

    @Step
    public void selectTitle(String title){
        registrationPage.selectTitle(title);
    }

    @Step
    public void enterFirstName(String firstName){
        registrationPage.enterFirstName(firstName);
    }

    @Step
    public
}
