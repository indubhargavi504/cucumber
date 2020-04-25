package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginclass {
	
	static WebDriver driver;
    //construtor
    public loginclass(WebDriver driver){
        this.driver=driver;
    }
    
    //save login page webelements
     //static By loginlink=By.linkText("Log in");
     
     @FindBy(linkText="Log in") static WebElement loginlink;
    static By email=By.id("Email");
    static By psd=By.id("Password");
    static By loginbutton=By.xpath("//input[@value='Log in']");
    
    //functionality or method
    
    public static void clicklogin(){
        loginlink.click();
        
    }
    public static void enteremail(String mail){
        driver.findElement(email).sendKeys(mail);
        
    }
    public static void enterpsd(String password){
        driver.findElement(psd).sendKeys(password);
    
    }
    public static void clickloginbutton(){
        driver.findElement(loginbutton).click();
    }

 

}


