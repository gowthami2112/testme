package cucumbercase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case3 {
	WebDriver Driver;
	@Given("User launches TestMeApp")
	public void user_launches_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String un) {
		Driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String psd) {
		Driver.findElement(By.name("password")).sendKeys(psd);
	}

	@When("user clicks login")
	public void user_clicks_login() {
		Driver.findElement(By.name("Login")).click();
	    
	}

	@When("user Enters product to search")
	public void user_Enters_product_to_search() {
	Driver.findElement(By.name("products")).sendKeys("HeadPhone");
	}

	@When("User clicks on findproduct")
	public void user_clicks_on_findproduct() {
		Driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("User verifies")
	public void user_verifies() {
	   
	}

}
