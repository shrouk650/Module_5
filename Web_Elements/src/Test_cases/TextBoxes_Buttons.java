package Test_cases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import Pages.Login_page;
import junit.framework.TestCase;

import org.testng.annotations.BeforeTest;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TextBoxes_Buttons {
	static WebDriver driver;

	@Test
	public void Invalid_username() {
		Login_page page = new Login_page(driver);
		page.Enter_Username().sendKeys("test");
		page.Enter_Password().sendKeys("1");
		page.Login_button().click();
		String error = page.Red_Error().getText();
		AssertJUnit.assertTrue(error.contains("Your username is invalid!"));
	}

	@Test
	public void Background_color() throws InterruptedException {
		Login_page page = new Login_page(driver);
		page.Login_button().click();
		Thread.sleep(2000);
		// get css selector 3chan assert (color , style)
		String color = page.Red_Error().getCssValue("background-color");
		System.out.println(color);
	}

	@BeforeTest
	public void beforeTest() {
		String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
