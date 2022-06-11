package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShortsStorepage {
	public WebDriver driver;
	By Shorts=By.xpath("//*[@id=\"menu\"]/ul/li[2]/a");

	public ShortsStorepage(WebDriver driver) {
		this.driver = driver;
	}
		public WebElement getShortsStorepage() {
		return driver.findElement(Shorts);
		}
}


