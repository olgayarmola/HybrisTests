package com.tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends BasePage {

    @FindBy(className = "name")
    WebElement productName;
    @FindBy(xpath = "//main/div[3]/div[1]/div[1]/span[2]")
    WebElement productSku;
    @FindBy(className = "price")
    WebElement productPrice;
    @FindBy(className = "description")
    WebElement productDescription;
    @FindBy(css = ".carousel.image-gallery__image.js-gallery-image.owl-carousel owl-theme")
    WebElement productBaseImage;
    @FindBy(css = ".carousel.gallery-carousel.js-gallery-carousel")
    WebElement productGalleryImages;
    @FindBy(id = "variant")
    WebElement productVariantSelector;
    @FindBy(css = ".qty-selector.input-group.js-qty-selector")
    WebElement productQtySelector;
    @FindBy(css = ".btn.btn-default.js-qty-selector-minus")
    WebElement productQtyDecrement;
    @FindBy(id = "pdpAddtoCartInput")
    WebElement productQtyInputField;
    @FindBy(css = ".btn.btn-default.js-qty-selector-plus")
    WebElement productQtyIncrement;
    @FindBy(id = "addToCartButton")
    WebElement productAddToCartButton;
    @FindBy(css = ".clearfix.tabs-list.tabamount4")
    WebElement tabsList;
    @FindBy(id = "configureProduct")
    WebElement configureProductButton;

    public void selectProductVariant(int optionNumber){
        element(productVariantSelector).selectByIndex(optionNumber);
    }

}
