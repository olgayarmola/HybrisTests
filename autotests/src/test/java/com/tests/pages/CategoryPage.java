package com.tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoryPage extends BasePage {

    @FindBy(css = ".product__listing.product__list")
    WebElement categoryProductList;

    public void clickOnProduct(String arg0) {
     categoryProductList.findElement(By.cssSelector("li:nth-child("+arg0+")")).findElement(By.tagName("a")).click();
    }
}
