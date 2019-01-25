package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDefinition {
	WebDriver driver;
	@Given("I want to launch the facebook in firefox browser")
	public void i_want_to_launch_the_facebook_in_firefox_browser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		}

	@When("I want to authenticate with valid credentails")
	public void i_want_to_authenticate_with_valid_credentails() {
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
	}

	@Then("I want to verify whether user navigated to home page or not")
	public void i_want_to_verify_whether_user_navigated_to_home_page_or_not() {
	    Assert.assertEquals(driver.getTitle(), "Home");
	}
}
