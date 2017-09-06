package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://electronics.local:9002/yacceleratorstorefront/electronics/en/")
public class RegistrationPage {

    //Registration form elements
    @FindBy(id = "registerForm")
    WebElement registrationForm;

    @FindBy(id = "register.title")
    Select registrationFormTitle;

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

    @FindBy(className = ".btn.btn-default.btn-block")
    WebElement registrationFormSubmitButton;

    //Fill the registration form
    public void selectTitle(String title) {
        registrationFormTitle.selectByValue(title);
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
}
