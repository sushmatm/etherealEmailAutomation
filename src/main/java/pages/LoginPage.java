package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import core.WaitManager;

public class LoginPage extends BasePage {

	private By usernameInput = By.id("address"); // username field
	private By passwordInput = By.id("password"); // password field
	private By loginButton = By.cssSelector("button[type='submit']");

	public LoginPage(WebDriver driver, WaitManager wait) {
		super(driver, wait);
	}

	public LoginPage open() {
		driver.get("https://ethereal.email/login");
		wait.waitForPageLoad();
		return this;
	}

	public HomePage login(String username, String password) {
		type(usernameInput, username);
		type(passwordInput, password);
		click(loginButton);
		wait.waitForPageLoad();
		return new HomePage(driver, wait);
	}
}
