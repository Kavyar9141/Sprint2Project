package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShirtsStorepage {
	public WebDriver driver;
	By Shirts=By.xpath("//*[@id=\"menu\"]/ul/li[2]/a");

	public ShirtsStorepage(WebDriver driver) {
		this.driver = driver;
	}
		public WebElement getShirtsStorepage() {
		return driver.findElement(Shirts);
		}
}

