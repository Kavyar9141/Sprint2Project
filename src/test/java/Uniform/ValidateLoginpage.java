package Uniform;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.Registerpage;
import PageObjects.Loginpage;
import Resources.Base;


public class ValidateLoginpage extends Base {
		public static Logger log = LogManager.getLogger(Base.class.getName());
		@BeforeTest
	public void initialize() throws IOException
	{

		
	  driver =initializeDriver();
	  driver.get(prop.getProperty("url2"));
	  
	  Loginpage L = new Loginpage(driver);
	  L.getLogin().click();
		
		}
		
	}

