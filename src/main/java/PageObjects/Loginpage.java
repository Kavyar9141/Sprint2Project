package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	public WebDriver driver;
	By Login=By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/ul/li[2]/a");

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}
		public WebElement getLogin() {
		return driver.findElement(Login);
		}
		}


