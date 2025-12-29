package businessFlows;

import pages.HomePage;
import pages.LoginPage;

public class LoginFlow {

	private final LoginPage loginPage;

	public LoginFlow(LoginPage loginPage) {
		this.loginPage = loginPage;

	}

	public HomePage doLogin(String username, String password) {
		return loginPage.open().login(username, password);

	}
}
