package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Registerpage {
	public WebDriver driver;
By Register=By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/ul/li[1]/as");

public Registerpage(WebDriver driver) {
	this.driver = driver;
}
	public WebElement getRegister() {
	return driver.findElement(Register);
	}





	
}

