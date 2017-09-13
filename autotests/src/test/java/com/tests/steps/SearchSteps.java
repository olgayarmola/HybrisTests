package com.tests.steps;

import com.tests.pages.BasePage;
import jnr.ffi.Struct;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps{

    BasePage basePage;

    public void openStorefront(){
        basePage.open();
    }

    public void enterKeywords(String keywords){
        basePage.enterInTheSearch(keywords);
    }

}
