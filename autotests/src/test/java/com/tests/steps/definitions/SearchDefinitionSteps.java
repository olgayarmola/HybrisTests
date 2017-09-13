import com.tests.steps.SearchSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;


public class SearchDefinitionSteps {
    @Steps
    SearchSteps steps;

    @Given("^open storefront$")
    public void openStorefront() throws Throwable {
        steps.openStorefront();
    }

    @When("^type \"([^\"]*)\" in the search field$")
    public void typeInTheSearchField(String arg0) throws Throwable {
        steps.enterKeywords(arg0);
    }
}
