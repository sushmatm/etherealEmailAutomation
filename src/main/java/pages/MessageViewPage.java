package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;
import core.WaitManager;

public class MessageViewPage extends BasePage {

	private By subject = By.xpath("//strong[text()='Subject:']/following-sibling::span");
	private By from = By.xpath("//strong[text()='From:']/following-sibling::span//a");
	private By to = By.xpath("//strong[text()='To:']/following-sibling::span//a");
	private By time = By.xpath("//strong[text()='Time:']/following-sibling::span");
	private By msgID = By.xpath("//strong[text()='Message-ID:']/following-sibling::span");
	private By msgBody = By.cssSelector("#message iframe");

	public MessageViewPage(WebDriver driver, WaitManager wait) {
		super(driver, wait);
	}

	
	public String getSubject() {
		return wait.waitforElementVisible(subject).getText().trim();

	}

	public String getFrom() {
		return wait.waitforElementVisible(from).getText().trim();

	}

	public String getTo() {
		return wait.waitforElementVisible(to).getText().trim();

	}

	public String getTime() {
		return wait.waitforElementVisible(time).getText().trim();

	}

	public String getMsgID() {
		return wait.waitforElementVisible(msgID).getText().trim();

	}

	public String getMsgBody() {
		WebElement ele = wait.waitforElementVisible(msgBody);
		driver.switchTo().frame(driver.findElement(msgBody));
		String msg = driver.findElement(By.tagName("body")).getText().trim();
		driver.switchTo().defaultContent();
		return msg;

	}

}
