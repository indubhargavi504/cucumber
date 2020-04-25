package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import skeleton.loginclass;

public class stepdef4 {
	
	
	
    
	WebDriver driver;
	    
	    @Given("launch application on chrome browser")
	    public void launch_application_on_chrome_browser() {
	        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("http://demowebshop.tricentis.com");
	    }


	    @Given("click on login link")
	    public void click_on_login_link() {
	    	 loginclass lc = PageFactory.initElements(driver,  loginclass.class);
	        lc.clicklogin();
	    }


	    @Given("enter email as {string}")
	    public void enter_email_as(String mailid) {
	    	 loginclass.enteremail(mailid);
	    }


	    @Given("enter password as {string}")
	    public void enter_password_as(String password) {
	    	 loginclass.enterpsd(password);
	    }


	    @Given("click on login")
	    public void click_on_login() {
	    	 loginclass.clickloginbutton();
	    }
	 



}
