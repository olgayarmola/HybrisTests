package pages;
import com.gargoylesoftware.htmlunit.Page;
import net.serenitybdd.core.*;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

@DefaultUrl("https://electronics.local:9002/yacceleratorstorefront/electronics/en/")
public class BasePage extends PageObject{

    public String defaultURL = "https://electronics.local:9002/yacceleratorstorefront/electronics/en/";

    @FindBy(xpath = "//header/nav[1]/div/div[2]/div/ul/li/a")
    WebElement loginRegisterLink;

    @FindBy(id = "ui-id-1")
    WebElement searchField;

    @FindBy(xpath = "/html/body/main/header/nav[1]/div/div[1]/div/div/div/a/img")
    WebElement siteLogo;

    @FindBy(xpath = "//header/nav[2]/div/div[2]/div[2]/ul/li[1]/div/a")
    WebElement storeFinderLink;

    @FindBy(xpath = "//header/nav[2]/div/div[2]/div[2]/ul/li[2]/div/div[1]/div")
    WebElement orderToolLink;

    @FindBy(className = "mini-cart-link js-mini-cart-link")
    WebElement cartIconLink;

    public void navigateToSignInPage(){
        clickOn(loginRegisterLink);
        waitFor(siteLogo);
    }


    public void navigateToStorefront(String s) {

    }
}
