package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://electronics.local:9002/yacceleratorstorefront/electronics/en/")
public class LoginPage extends BasePage {

    //Returning Customer form
    @FindBy(id = "j_username")
    WebElement emailAddressField;

    @FindBy(id = "j_password")
    WebElement passwordField;

    @FindBy(className = "forgotten-password")
    WebElement forgotPasswordLink;

    @FindBy(xpath = "//main/div[3]/div/div[1]/div/div/div/form/button")
    WebElement loginButton;

    public void enterLoginEmail(String login){
        emailAddressField.sendKeys(login);
    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);

    }
    public void clickLoginButton(){
        loginButton.click();
    }

    public void verifyUserIsLoggedIn() {
        Assert.assertTrue(myAccountLinkInHeader.isDisplayed());
    }

    //Create An Account form

}
