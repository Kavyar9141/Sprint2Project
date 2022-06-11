package StepDefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import PageObjects.Homepage;
import Resources.Base;
@RunWith(Cucumber.class)
public class HomepageSteps extends Base {
	 @Given("^initialize browser with chrome$")
	    public void initialize_browser_with_chrome() throws Throwable {
		 driver =initializeDriver();
	       
	    }

	   @And("^navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
		   driver.get(strArg1);
	    }

	    @And("^click on profile icon$")
	    public void click_on_profile_icon() throws Throwable {
	    	Homepage H = new Homepage(driver);
	    	H.getprofileicon().click();
	    }

	    @And("^close browser$")
	    public void close_browser() throws Throwable {
	    	driver.close();
	    }
	    @Then("^verify register and login button appears$")
	    public void verify_register_and_login_button_appears() throws Throwable {
	        throw new PendingException();
	    }
	}
