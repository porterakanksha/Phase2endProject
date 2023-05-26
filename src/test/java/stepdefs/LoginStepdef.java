package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
public class LoginStepdef {
	
	WebDriver driver = Hooks.driver;
	

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com/");
	}
	
	@When("I enter username as {string}")
	public void i_enter_username_as(String UserName) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement user = driver.findElement(By.name("user-name"));
		user.sendKeys(UserName);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String Password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(Password);
		Thread.sleep(3000);
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement login = driver.findElement(By.xpath("//input[@name='login-button']"));
		login.click();
		Thread.sleep(2000);
	    
	}

	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement homepage = driver.findElement(By.xpath("//div[@class='app_logo']"));
	
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String ExpError) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement error =
				  driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ActError = error.getText();
				 Assert.assertEquals(ActError,ExpError);
				 
	}
	
}