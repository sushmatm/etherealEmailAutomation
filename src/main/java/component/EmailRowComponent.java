package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BasePage;
import pages.MessageViewPage;

public class EmailRowComponent extends BasePage {

	private WebElement root;

	public EmailRowComponent(WebElement root) {
		super();
		this.root = root;
	}

	private By subjectLink = By.cssSelector("td:nth-of-type(2) a");
	private By dateCell = By.cssSelector("td:nth-of-type(3)");

	public String getSubject() {
		return root.findElement(subjectLink).getText();
	}

	public String getDate() {
		return root.findElement(dateCell).getText().trim();
	}

	public MessageViewPage openEmail() {
		root.findElement(subjectLink).click();
		wait.waitForPageLoad();
		return new MessageViewPage(driver, wait);
	}

}
