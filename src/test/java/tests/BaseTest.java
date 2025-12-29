package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import core.DriverFactory;
import core.WaitManager;

public class BaseTest {

	protected WebDriver driver;
	protected WaitManager wait;

	@BeforeMethod
	public void setup() {
		driver = DriverFactory.initDriver();
		wait = new WaitManager(driver);

	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();
	}

}
