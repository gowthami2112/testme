package cucumbercase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case2 {
	WebDriver Driver;
	@Given("user open testMeapp")
	public void user_open_testMeapp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enter username as <{string}> And enter password as <{string}>")
	public void user_enter_username_as_And_enter_password_as(String un, String psd) {
	   Driver.findElement(By.name("userName")).sendKeys(un);
	   Driver.findElement(By.name("password")).sendKeys(psd);
	}
	

	@Then("click ok")
	public void click_ok() {
		 Driver.findElement(By.name("Login")).click();
	}

	@Then("verify login result")
	public void verify_login_result() {
	   System.out.println("click ok");
	}
}
