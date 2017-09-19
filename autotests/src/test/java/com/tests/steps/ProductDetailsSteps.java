package com.tests.steps;

import com.tests.pages.CategoryPage;
import com.tests.pages.ProductDetailsPage;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductDetailsSteps extends ScenarioSteps{

    ProductDetailsPage productDetailsPage;
    CategoryPage categoryPage;

    public void openCategory(String arg0) {
        productDetailsPage.openCategory(arg0);

    }

    public void openProductNumber(String arg0) {
        categoryPage.clickOnProduct(arg0);
    }

    public void typeInQtyField(String arg0) {
        productDetailsPage.typeInQtyField(arg0);
    }

    public void incrementProductQty() {
        productDetailsPage.incrementProductQty();
    }

    public void verifyProductQtyIs(int arg0) {
        productDetailsPage.verifyProductQtyIs(arg0);
    }
}
