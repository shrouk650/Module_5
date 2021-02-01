package Test_cases;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CheckBox_page;


public class CheckBoxes {
	static WebDriver driver;
	static boolean check;

	@Test
	public void CheckBox() {
		CheckBox_page page = new CheckBox_page(driver);

		check = page.Checkbox("1").isSelected();
		assertFalse(check);
		page.Checkbox("1").click();
		check = page.Checkbox("1").isSelected();
		assertTrue(check);
		// ana 3yza at2ked elemenet da check wla selected or not
		check = page.Checkbox("2").isSelected();
		assertTrue(check);
	}

	@BeforeTest
	public void beforeTest() {
		String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
