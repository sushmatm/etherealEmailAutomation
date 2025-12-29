package component;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;
import core.WaitManager;

public class EmailListComponent extends BasePage {

	public EmailListComponent(WebDriver driver, WaitManager wait) {
		super(driver, wait);
	}

	private By tableRows = By.cssSelector("table tbody tr");

	public List<EmailRowComponent> getAllRows() {
		List<WebElement> rows = driver.findElements(tableRows);
		List<EmailRowComponent> emailRows = new ArrayList<EmailRowComponent>();

		for (WebElement row : rows) {
			emailRows.add(new EmailRowComponent(row));
		}

		return emailRows;
	}

	public EmailRowComponent getRowByIndex(int index) {
		return getAllRows().get(index);
	}

	public EmailRowComponent getRowBySubject(String subject) {

		for (EmailRowComponent row : getAllRows()) {
			if (row.getSubject().equals(subject))
				return row;
		}

		return null;
	}

}
