package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.recruitment;

public class tc3_search_employee {

	recruitment rec=new recruitment(hooks.driver);
	@Given("user is in the recruitment page")
	public void user_is_in_the_recruitment_page() {
		rec.precondition();
		rec.clickRecruitment();
	    System.out.println("user is in the recruitment page");
	}
	@When("he enters the candidate name as {string}")
	public void he_enters_the_candidate_name_as(String name) {
		rec.sendCandidateKeys(name);
	    System.out.println("he enters candidate name as"+name);
	    rec.clickSearch();
	}

	@Then("the system displays the result")
	public void the_system_displays_the_result() {
	    System.out.println("he displays the result");
	}
}
