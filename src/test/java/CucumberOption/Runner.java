package CucumberOption;




	import org.junit.runner.RunWith;



	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	import cucumber.api.testng.AbstractTestNGCucumberTests;



	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "/src/test/resources/Features/Homepage.feature",
	glue={"HomepageSteps"}
	
	)
	public class Runner extends AbstractTestNGCucumberTests {



	}

