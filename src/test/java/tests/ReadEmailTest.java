package tests;

import org.testng.annotations.Test;

import businessFlows.LoginFlow;
import pages.InboxPage;
import pages.LoginPage;
import pages.MessageViewPage;

public class ReadEmailTest extends BaseTest {

	@Test
	public void readEmailDetails() {
	     LoginFlow login = new LoginFlow(new LoginPage(driver, wait));
	     InboxPage inbox=   login.doLogin(
	            "jennyfer.donnelly22@ethereal.email",
	            "jHt52AwPf7NcFXEPKP"
	        ).gotoMessage();
	        
	      

		MessageViewPage view = inbox.getEmailList().getRowByIndex(0).openEmail();
		
		System.out.println("Subject:"+ view.getSubject());
        System.out.println("FROM: " + view.getFrom());
        System.out.println("TO: " + view.getTo());
        System.out.println("MsgBody: " + view.getMsgBody());
        System.out.println("MsgID: " + view.getMsgID());
        System.out.println("Time: " + view.getTime());
	}

}
