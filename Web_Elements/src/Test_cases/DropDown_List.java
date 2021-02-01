package Test_cases;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDown_List {

	static WebDriver driver;
	static boolean check;

	@Test
	public void DropDown_Method_One() throws InterruptedException {
		driver.findElement(By.xpath("//option[@value=\"1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Option 2']")).click();
		Thread.sleep(2000);
		assertFalse(driver.findElement(By.xpath("//option[text()='Please select an option']")).isEnabled());
		assertTrue(driver.findElement(By.xpath("//option[text()='Option 2']")).isEnabled());
	}

	@Test
	public void DropDown_Method_Two() throws InterruptedException {
		Select select = new Select(driver.findElement(By.id("dropdown")));
		// y5tar option 2
		select.selectByValue("2");
		Thread.sleep(2000);
		select.selectByVisibleText("Option 1");
		Thread.sleep(2000);
		assertFalse( select.getOptions().get(0).isEnabled());
		assertTrue( select.getOptions().get(1).isEnabled());
	}

	@BeforeTest
	public void beforeTest() {
		String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
