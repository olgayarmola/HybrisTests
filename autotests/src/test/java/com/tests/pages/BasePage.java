package com.tests.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://electronics.local:9002/yacceleratorstorefront/electronics/en/")
public class BasePage extends PageObject{


    @FindBy(xpath = "//header/nav[1]/div/div[2]/div/ul/li/a")
    WebElement loginRegisterLink;

    @FindBy(className = "myAccountLinksHeader")
    WebElement myAccountLinkInHeader;

    @FindBy(xpath = "//header/nav[1]/div/div[2]/div/ul/li[3]/a")
    WebElement signOutLinkInHeader;

    @FindBy(id = "js-site-search-input")
    WebElement searchField;

    @FindBy(css = ".ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content")
    WebElement searchAutocompleteBox;

    @FindBy(css = ".btn.btn-link.js_search_button")
    WebElement searchButton;

    @FindBy(xpath = "/html/body/main/header/nav[1]/div/div[1]/div/div/div/a/img")
    WebElement siteLogo;

    @FindBy(xpath = "//header/nav[2]/div/div[2]/div[2]/ul/li[1]/div/a")
    WebElement storeFinderLink;

    @FindBy(xpath = "//header/nav[2]/div/div[2]/div[2]/ul/li[2]/div/div[1]/div")
    WebElement orderToolLink;

    @FindBy(className = "mini-cart-link js-mini-cart-link")
    WebElement cartIconLink;

    @FindBy(css = ".nav__links.nav__links--products.js-offcanvas-links")
    WebElement navigationSection;

    @FindBy(className = "breadcrumb")
    WebElement breadcrumbs;

    public void navigateToSignInPage(){
        clickOn(loginRegisterLink);
        waitFor(siteLogo);
    }

    public void enterInTheSearch(String query){
        searchField.sendKeys(query);
    }

    public boolean searchAutocompleteBoxIsShown(){
       return (searchAutocompleteBox.isDisplayed());
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public void openCategory(String arg0) {
        navigationSection.findElement(By.xpath("//a[@title=\""+arg0+"\"]")).click();
    }

}
