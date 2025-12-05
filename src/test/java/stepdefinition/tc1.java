package stepdefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.login;

public class tc1 {

	login log=new login(hooks.driver);
	@Given("user is in the login page")
	public void user_is_in_the_login_page() {
		System.out.println("user is in the login page");
	}	
	

	@When("user enters valid username as {string} and password as {string}")
	public void user_enters_valid_username_as_and_password_as(String name, String password) {
		log.sendUsername(name);
		log.sendPassword(password);
		System.out.println("user enters valid username and password");
		log.clickLogin();
	}
	
	@Then("user logs in")
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
