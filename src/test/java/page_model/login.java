package page_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	public login(WebDriver driver) {
		this.driver=driver;
	}
	public void sendUsername(String name) {
		driver.findElement(By.name("username")).sendKeys(name);
	}
	public void sendPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	public void perfromlogin() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
