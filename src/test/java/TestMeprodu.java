package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;


public class TestMeprodu {
	
	WebDriver driver;
	
	@Given("user login in the TestMe app")
	public void user_login_in_the_TestMe_app() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    driver.findElement(By.xpath("//a[@href = 'login.htm']")).click();
	    driver.findElement(By.id("userName")).sendKeys("lalitha");
	    driver.findElement(By.id("password")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click();
		
	    
	}

	@Given("user enters head in the search box")
	public void user_enters_head_in_the_search_box() {
		
	    driver.findElement(By.id("myInput")).sendKeys("head");
		
	}

	@Given("user clicks on find details")
	public void user_clicks_on_find_details() {
	    
		driver.findElement(By.xpath("//input[@value = 'FIND DETAILS']")).click();
		
	}
	
	

	@Given("user  clicks on add to cart, cart icon, check out, proceed to pay")
	public void user_clicks_on_add_to_cart_cart_icon_check_out_proceed_to_pay() {
	    
         driver.findElement(By.xpath("//a[@class = 'btn btn-success btn-product']")).click();		
		
	}
	

	@Given("user select bank and click on continue")
	public void user_select_bank_and_click_on_continue() {

		driver.findElement(By.xpath("//a[@href = 'displayCart.htm']")).click();
		driver.findElement(By.xpath("//a[@href = 'checkout.htm']")).click();
		driver.findElement(By.xpath("//input[@value = 'Proceed to Pay']")).click();
		
	}


	@Given("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
	 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(), 'Andhra Bank')]")).click();
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//input[@value = 'LOGIN']")).click();
		
		
	}

	@Given("user enters trans password")
	public void user_enters_trans_password() {

		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		
       
		
	}

	@Given("user clicks on pay now")
	public void user_clicks_on_pay_now() {
		
		driver.findElement(By.xpath("//input[@value = 'PayNow']")).click();
		driver.findElement(By.xpath("//a[@href = 'logout.htm']")).click();
		
		
		
	   
		
	}

}
