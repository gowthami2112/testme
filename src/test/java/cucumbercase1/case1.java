package cucumbercase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1 {
	WebDriver Driver;

		@Given("user lunaching TestMeApp")
		public void user_lunaching_TestMeApp() {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			Driver = new ChromeDriver();
			Driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
		}

		@When("user enter username as {string}")
		public void user_enter_username_as(String un) {
			Driver.findElement(By.name("userName")).sendKeys(un);
		}

		@When("user enter firstname as {string}")
		public void user_enter_firstname_as(String fn) {
			Driver.findElement(By.name("firstName")).sendKeys(fn);
		}

		@When("user enter lastname as {string}")
		public void user_enter_lastname_as(String ln) {
			Driver.findElement(By.name("lastName")).sendKeys(ln);;
		}

		@When("user enter password as {string}")
		public void user_enter_password_as(String pa) {
			Driver.findElement(By.name("password")).sendKeys(pa);;
			
		}

		@When("user enter confirmpassword as {string}")
		public void user_enter_confirmpassword_as(String cp) {
			Driver.findElement(By.name("confirmPassword")).sendKeys(cp);;
		}

		@When("user select gender as {string}")
		public void user_select_gender_as(String string) {
			Driver.findElement(By.xpath("//input[@type='radio'][@value='Female']")).click();
		}

		@When("user enter Email as {string}")
		public void user_enter_Email_as(String em) {
			Driver.findElement(By.name("emailAddress")).sendKeys(em);;
			
		}

		@When("user enter mobile number  as {string}")
		public void user_enter_mobile_number_as(String mn) {
			Driver.findElement(By.name("mobileNumber")).sendKeys(mn);;
		}

		@When("user enter DOB as {string}")
		public void user_enter_DOB_as(String db) {
			Driver.findElement(By.name("dob")).sendKeys(db);;
		    
		}

		@When("user enter Address as {string}")
		public void user_enter_Address_as(String ad) {
			Driver.findElement(By.name("address")).sendKeys(ad);;
		}

		@When("user select SecurityQuestion as {string}")
		public void user_select_SecurityQuestion_as(String string) {
			Select s= new Select (Driver.findElement(By.name("securityQuestion")));
			s.selectByValue("411012");
		    
		}

		@When("user enter answer as {string}")
		public void user_enter_answer_as(String string) {
			Driver.findElement(By.name("answer")).sendKeys("RED");
		}

		@Then("user click submit")
		public void user_click_submit() {
			Driver.findElement(By.xpath("//input[@type='submit'][@value='Register']")).click();
		    
		}
}
