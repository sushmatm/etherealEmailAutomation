package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.DriverFactory;
import core.WaitManager;

public class BasePage {

	protected WebDriver driver;
	protected WaitManager wait;

	public BasePage(WebDriver driver, WaitManager wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public BasePage() {
		this.driver = DriverFactory.getDriver();
		this.wait = new WaitManager(driver);
	}

	protected WebElement find(By locator) {
		return wait.waitforElementVisible(locator);
	}

	protected void click(By locator) {
		// find(locator).click();
		wait.waitForElementClickable(locator).click();
	}

	protected void type(By locator, String text) {
		WebElement ele = find(locator);
		ele.clear();
		ele.sendKeys(text);
	}

	protected String getText(By locator) {
		return find(locator).getText();
	}

}
