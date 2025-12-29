package core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitManager {

	WebDriver driver;

	public WaitManager(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitforElementVisible(By locator) {

		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public WebElement waitForElementClickable(By locator) {
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void waitForPageLoad() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> ((JavascriptExecutor) driver)
				.executeScript("return document.readyState").toString().equals("complete"));
	}

	public void sleep(long milisec) {
		try {
			Thread.sleep(milisec);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}
