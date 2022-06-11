package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Homepage {
public WebDriver driver;
By profileicon=By.xpath("/html/body/nav/header/div/div[3]/div/ul/li[3]/a/i");
public Homepage(WebDriver driver) {
	this.driver= driver;
}
public WebElement getprofileicon() {
	return driver.findElement(profileicon);
}
}
