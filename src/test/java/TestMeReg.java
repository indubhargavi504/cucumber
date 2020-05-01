package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;

public class TestMeReg {
	
	WebDriver driver;
	
	@Given("user should open the testme app in browser")
	public void user_should_open_the_testme_app_in_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    driver.findElement(By.xpath("//a[@href= 'RegisterUser.htm']")).click();
	}

	@Given("user enters username as {string}")
	public void user_enters_username_as(String un) {
		
		driver.findElement(By.id("userName")).sendKeys(un);
	}

	@Given("user enters firstname as {string}")
	public void user_enters_firstname_as(String fn) {
		
		driver.findElement(By.id("firstName")).sendKeys(fn);
	}

	@Given("user enters lastname as {string}")
	public void user_enters_lastname_as(String ln) {
	    
		driver.findElement(By.id("lastName")).sendKeys(ln);

	}

	@Given("user enters password as {string}")
	public void user_enters_password_as(String pwd) {
		
		driver.findElement(By.id("password")).sendKeys(pwd);
	    
	}

	@Given("user enters confirm password as {string}")
	public void user_enters_confirm_password_as(String cnpwd) {
		
		driver.findElement(By.id("pass_confirmation")).sendKeys(cnpwd);
	    
	}

	@Given("user selects gender as female")
	public void user_selects_gender_as_female() {
		
		driver.findElement(By.xpath("//input[@value = 'Female']")).click();
	   
	}

	@Given("user enters mailid as {string}")
	public void user_enters_mailid_as(String mailid) {
	  
		driver.findElement(By.id("emailAddress")).sendKeys(mailid);
	}

	@Given("user enters mobile number as {string}")
	public void user_enters_mobile_number_as(String mbno) {
		
		driver.findElement(By.id("mobileNumber")).sendKeys(mbno);
	    
	}

	@Given("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
		
		driver.findElement(By.name("dob")).sendKeys(dob);
	    
	}

	@Given("user enters address as {string}")
	public void user_enters_address_as(String addr) {
		
		driver.findElement(By.id("address")).sendKeys(addr);
	   
	}

	@Given("user enters selects security question")
	public void user_enters_selects_security_question() {
		
		WebElement dropdown = driver.findElement(By.id("securityQuestion"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
	    
	}

	@Given("user enters answer as {string}")
	public void user_enters_answer_as(String ans) {
		
		driver.findElement(By.id("answer")).sendKeys(ans);
	    
	}
	@Given("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    
		
		driver.findElement(By.name("Submit")).click();
		 
		 
	}
	
}
