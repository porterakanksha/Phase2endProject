package stepdefs;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCart  {
	WebDriver driver = Hooks.driver;
	
	@When("I select Product")
	public void i_select_Product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement Product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	   Thread.sleep(2000);
	   Product.click();
	   
	}

	@When("Add product to cart")
	public void add_product_to_cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement addtocart = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
		addtocart.click();
		Thread.sleep(2000);
		
	}

	@Then("Show in Cart")
	public void show_in_Cart() {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement Cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	   Cart.click();
	}
	
	/*TakesScreenshot tsObj = (TakesScreenshot)driver;
	File fileObj = tsObj.getScreenshotAs(OutputType.FILE);
	File screenshotObj = new File("src/test/java/Selenium/screenshot.png");
	//FileUtils.copyFile(fileObj,screenshotObj);
*/
	
}




