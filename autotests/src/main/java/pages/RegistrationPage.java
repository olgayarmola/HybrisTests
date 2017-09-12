package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://electronics.local:9002/yacceleratorstorefront/electronics/en/login")
public class RegistrationPage extends BasePage{

    //Registration form elements
    @FindBy(id = "registerForm")
    WebElement registrationForm;

    @FindBy(id = "register.title")
    WebElement registrationFormTitle;

    //Select registrationFormTitle = new Select(selectTitleId);

    @FindBy(id = "register.firstName")
    WebElement registrationFormFirstName;

    @FindBy(id = "register.lastName")
    WebElement registrationFormLastName;

    @FindBy(id = "register.email")
    WebElement registrationFormEmail;

    @FindBy(id = "password")
    WebElement registrationFormPassword;

    @FindBy(id = "register.checkPwd")
    WebElement registrationFormPasswordConfirm;

    @FindBy(css = ".btn.btn-default.btn-block")
    WebElement registrationFormSubmitButton;

    //Fill the registration form
    public void selectTitle(String title) {
        element(registrationFormTitle).selectByVisibleText(title);
    }
    public void enterFirstName(String firstName){
        registrationFormFirstName.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        registrationFormLastName.sendKeys(lastName);
    }
    public void enterEmail(String email){
        registrationFormEmail.sendKeys(email);
    }
    public void enterPassword(String password){
        registrationFormPassword.sendKeys(password);
    }
    public void confirmPassword(String confirmPassword){
        registrationFormPasswordConfirm.sendKeys(confirmPassword);
    }
    public void submitRegistrationForm(){
        registrationFormSubmitButton.click();
    }
    public void verifyUserRegistered(){ Assert.assertTrue(myAccountLinkInHeader.isDisplayed());}
}
