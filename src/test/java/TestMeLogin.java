package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;

public class TestMeLogin {
	
	WebDriver driver;
	@Given("user navigate login of TestMe app")
	public void user_navigate_login_of_TestMe_app() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    driver.findElement(By.xpath("//a[@href = 'login.htm']")).click();
		
	}

	@Given("user enters username for login as {string}")
	public void user_enters_username_for_login_as(String umn) {
	    
		driver.findElement(By.id("userName")).sendKeys(umn);
	}

	@Given("user enters password for login as {string}")
	public void user_enters_password_for_login_as(String psd) {
	    driver.findElement(By.id("password")).sendKeys(psd);
	}

	@Given("user click on login button")
	public void user_click_on_login_button() {
	    
		driver.findElement(By.name("Login")).click();
		driver.close();
		
	}
	
}