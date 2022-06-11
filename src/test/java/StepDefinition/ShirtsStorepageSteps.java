package StepDefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import PageObjects.ShirtsStorepage;
import Resources.Base;

@RunWith(Cucumber.class)
public class ShirtsStorepageSteps extends Base {
	
	@Given("^initialize browser with chrome$")
    public void initialize_browser_with_chrome() throws Throwable {
		driver =initializeDriver();
        throw new PendingException();
    }

    @Then("^verify register and login button appears$")
    public void verify_register_and_login_button_appears() throws Throwable {
        throw new PendingException();
    }

    @Then("^user should navigate to the shirt page$")
    public void user_should_navigate_to_the_shirt_page() throws Throwable {
        throw new PendingException();
    }

    @And("^navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
        throw new PendingException();
    }

    @And("^click on profile icon$")
    public void click_on_profile_icon() throws Throwable {
    	ShirtsStorepage S = new ShirtsStorepage(driver);
        throw new PendingException();
    }

    @And("^click on shirts$")
    public void click_on_shirts() throws Throwable {
    	
        throw new PendingException();
    }

    @And("^close browser$")
    public void close_browser() throws Throwable {
    driver.close();
        throw new PendingException();
    }

}

