package com.tests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.tests.pages.BasePage;

public class GlobalElementsSteps extends ScenarioSteps {

    BasePage basePage;

    @Step
    public void openStoreFrontPage(){basePage.open();}
    }
