package com.tests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.tests.pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void navigateToStorefront(){
        loginPage.open();
    }

    @Step
    public void navigateToSignInPage(){
        loginPage.navigateToSignInPage();
    }

    @Step
    public void enterLoginEmail(String login){
        loginPage.enterLoginEmail(login);
    }

    @Step
    public void enterPassword(String password){
        loginPage.enterPassword(password);
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyUserIsLoggedIn() {
        loginPage.verifyUserIsLoggedIn();
    }

    public void clickSignOutLink() { loginPage.clickSignOutLink();}

    public void verifyUserIsLoggedOut() { loginPage.verifyUserLoggedOut();
    }

    public void clickForgotPasswordLink() { loginPage.clickForgotPasswordLink();
    }

    public void verifyResetPasswordPopupIsShown() { loginPage.verifyResetPasswordPopupIsShown();
    }
}
