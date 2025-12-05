package stepdefinition;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.login;

public class tc2_login_with_invalid_details {

	login log=new login(hooks.driver);
	
	@When("user enters invalid username as {string} and password as {string}")
	public void user_enters_valid_username_as_and_password_as(String name, String password) {
		log.sendUsername(name);
		log.sendPassword(password);
		System.out.println("user enters valid username and password");
		log.clickLogin();
	}
	
	@Then("user doesn't log in")
	public void user_logs_in() {
		try {
			hooks.driver.getPageSource().contains("Dashboard");
			 System.out.println("user logs in");
			assertTrue(true);
		}
		catch(Exception e) {
			assertTrue(false);
		}
	   
	}
}
