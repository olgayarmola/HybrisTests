package com.tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://electronics.local:9002/yacceleratorstorefront/electronics/en/search/?text=")
public class SearchResultsPage extends BasePage {

    @FindBy(tagName = "h1")
    WebElement pageTitle;

    @FindBy(css = ".product__listing.product__list")
    WebElement productResultsList;

    public void checkTitle(String searchQuery){
        String actualTitle = pageTitle.getText();
        Assert.assertTrue(actualTitle.contains(searchQuery));
    }

    public void checkURL(){
        String currentURL = getDriver().getCurrentUrl();
        Assert.assertTrue(currentURL.contains(this.getClass().getAnnotation(DefaultUrl.class).value()));
    }

    public void checkProductsListShown(){
        Assert.assertTrue(productResultsList.isDisplayed());
    }


}
