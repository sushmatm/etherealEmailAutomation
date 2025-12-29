package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import core.WaitManager;

public class HomePage extends BasePage {


	private By messageLink = By.linkText("Messages");
	private By messagePageLoad = By.xpath("//span[contains(normalize-space(.),'Messages for')]");
	
	public HomePage(WebDriver driver, WaitManager wait) {
		super(driver, wait);
	}
	
	public InboxPage gotoMessage() {
		wait.waitForElementClickable(messageLink).click();
		wait.waitforElementVisible(messagePageLoad);
		return new InboxPage(driver, wait);
	}
	
}
