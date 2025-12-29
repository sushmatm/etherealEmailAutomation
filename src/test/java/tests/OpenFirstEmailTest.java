package tests;

import org.testng.annotations.Test;

import businessFlows.LoginFlow;
import pages.InboxPage;
import pages.LoginPage;

public class OpenFirstEmailTest extends BaseTest {
	


	    @Test
	    public void openFirstEmail() {
	    	
	        LoginFlow login = new LoginFlow(new LoginPage(driver, wait));
	     InboxPage inbox=   login.doLogin(
	            "jennyfer.donnelly22@ethereal.email",
	            "jHt52AwPf7NcFXEPKP"
	        ).gotoMessage();
	        
	      

	        // click first email
	        inbox.getEmailList()
	             .getRowByIndex(0)
	             .openEmail();

	        // simple pause to see action
	        try { Thread.sleep(2000); } catch (Exception ignored) {}
	    }
	}
