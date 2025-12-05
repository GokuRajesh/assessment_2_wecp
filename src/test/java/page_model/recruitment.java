package page_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepdefinition.hooks;

public class recruitment {
	
	
	WebDriver driver;
	public recruitment(WebDriver driver) {
		this.driver=driver;
	}
	
	public void precondition() {
		login log=new login(driver);
		log.perfromlogin();
	}
	public void clickRecruitment() {
		driver.findElement(By.cssSelector(".active > span:nth-child(2)")).click();
	}
	public void sendCandidateKeys(String name) {
		driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input:nth-child(2)")).sendKeys(name);
	}
}
