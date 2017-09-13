package com.tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        "src/test/resources/features/login/login_by_login_link.feature",
        "src/test/resources/features/login/logout.feature"
})

public class LoginTestSuite {
}
