package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PantStorepage {
	public WebDriver driver;
	By Pant=By.xpath("//*[@id=\"menu\"]/ul/li[1]/a");

	public PantStorepage(WebDriver driver) {
		this.driver = driver;
	}
		public WebElement getPantStorepage() {
		return driver.findElement(Pant);
		}
}
