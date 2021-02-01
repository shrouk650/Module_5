package Test_cases;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CheckBox_page;

public class Check_Visibaility {
	static WebDriver driver;

	@Test
	public void CheckBox() {
		CheckBox_page page = new CheckBox_page(driver);

		
	}

	@BeforeTest
	public void beforeTest() {
		String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
