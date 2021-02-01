package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
	WebDriver driver;

	public Login_page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Elemental_Selenium() {

		return (driver.findElement(By.xpath("//a[@target=\"_blank\"]")));
	}

	public WebElement Red_Error() {

		return (driver.findElement(By.id("flash")));
	}

	public WebElement Login_button() {

		return (driver.findElement(By.cssSelector("#login > button")));
	}
	public WebElement Enter_Username() {

		return (driver.findElement(By.id("username")));
	}
	public WebElement Enter_Password() {

		return (driver.findElement(By.id("password")));
	}
}
