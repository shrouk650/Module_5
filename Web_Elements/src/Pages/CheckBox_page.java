package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox_page {
	WebDriver driver;

	public CheckBox_page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Checkbox(String num) {

		return (driver.findElement(By.xpath("(//input[@type=\"checkbox\"])["+num+"]")));
	}
}
//27ded el checkbox w ana hb3tlk rakmo 
//driver.findElement(By.xpath("(//input[@type=\"checkbox\"])["+num+"]"))