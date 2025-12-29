package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import component.EmailListComponent;
import core.WaitManager;

public class InboxPage extends BasePage {

	public InboxPage(WebDriver driver, WaitManager wait) {
		super(driver, wait);
	}

	private By tableList = By.cssSelector("table");


	public boolean isPageLoaded() {
		return wait.waitforElementVisible(tableList).isDisplayed();

	}

	public EmailListComponent getEmailList() {
		return new EmailListComponent(driver,wait);
	}

}
