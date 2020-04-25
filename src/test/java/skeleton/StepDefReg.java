package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefReg {
	
	 WebDriver driver;
	@Given("user should navigates to demowebshop on chrome browser")
	public void user_should_navigates_to_demowebshop_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	}

	@When("user clicks on register link")
	public void user_clicks_on_register_link() {
		
		driver.findElement(By.linkText("Register")).click();
	    
	}

	@When("user selects gender")
	public void user_selects_gender() {
	 
		driver.findElement(By.id("gender-female")).click();
	}

	@When("user enters with first name as {string}")
	public void user_enters_with_first_name(String fn) {
	    
		driver.findElement(By.id("FirstName")).sendKeys(fn);
	}

	@Given("user enters with last name  as {string}")
	public void user_enters_with_last_name_as(String ln) {
	 
		driver.findElement(By.id("LastName")).sendKeys(ln);
	}

	@Given("user enters with email as {string}")
	public void user_enters_with_email_as(String email) {
	 
		
		driver.findElement(By.id("Email")).sendKeys(email);
	}
	   

	@When("user enters with paasword as {string}")
	public void user_enters_with_paasword(String psd) {
		
		driver.findElement(By.id("Password")).sendKeys(psd);
		
	    
	}

	@When("user enters with confirm password as {string}")
	public void user_enters_with_confirm_password(String cnpsd) {
	    
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cnpsd);
	}

	@Then("user clicks on register button")
	public void user_clicks_on_register_button() {
	    
		driver.findElement(By.id("register-button")).click();
		
	}
	
	@When("user should verify registration success")
	public void user_should_verify_registration_success() {
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Register"));
		driver.close();
	    
		
		
	}

}
