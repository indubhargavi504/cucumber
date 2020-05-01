package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

 

import cucumber.api.java.en.Given;

 


public class cartpay2 {
    WebDriver driver;
    @Given("user shoud navigate to testmeapp page in Chrome Browser")
    public void user_shoud_navigate_to_testmeapp_page_in_Chrome_Browser() {
    	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
    }

 

    @Given("user click on SignUp link")
    public void user_click_on_SignUp_link() {
        driver.findElement(By.linkText("SignUp")).click();
    }

 

    @Given("user enters with case{int} username as {string}")
    public void user_enters_with_case_username_as(Integer int1, String un) {
        driver.findElement(By.name("userName")).sendKeys(un);
    }

 

    @Given("user enters with case{int} FirstName as {string}")
    public void user_enters_with_case_FirstName_as(Integer int1, String fn) {
        driver.findElement(By.name("firstName")).sendKeys(fn);
    }

 

    @Given("user enters with case{int} LastName as {string}")
    public void user_enters_with_case_LastName_as(Integer int1, String ln) {
        driver.findElement(By.name("lastName")).sendKeys(ln);
    }

 

    @Given("user enters with case{int} Password as {string}")
    public void user_enters_with_case_Password_as(Integer int1, String psd) {
        driver.findElement(By.name("password")).sendKeys(psd);
    }

 

    @Given("user enters with case{int} Confirm Password as {string}")
    public void user_enters_with_case_Confirm_Password_as(Integer int1, String cpsd) {
        driver.findElement(By.name("confirmPassword")).sendKeys(cpsd);
    }

 

    @Given("user selects case{int} Gender")
    public void user_selects_case_Gender(Integer int1) {
        driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/input[1]")).click();
    }

 

    @Given("user enters with cas{int} Email as {string}")
    public void user_enters_with_cas_Email_as(Integer int1, String mail) {
        driver.findElement(By.name("emailAddress")).sendKeys(mail);
    }

 

    @Given("user enters with case{int} Mobile number as {string}")
    public void user_enters_with_case_Mobile_number_as(Integer int1, String phn) {
        driver.findElement(By.name("mobileNumber")).sendKeys(phn);
    }

 

    @Given("user enters with cas{int} Date of Birth as {string}")
    public void user_enters_with_cas_Date_of_Birth_as(Integer int1, String dob) {
        driver.findElement(By.name("dob")).sendKeys(dob);
    }

 

    @Given("user enters with case{int} address as {string}")
    public void user_enters_with_case_address_as(Integer int1, String add) {
        driver.findElement(By.name("address")).sendKeys(add);
    }

 

    @Given("user enters case{int} security Answer as {string}")
    public void user_enters_case_security_Answer_as(Integer int1, String ans) {
        driver.findElement(By.name("answer")).sendKeys(ans);
    }

 

    @Given("user clicks on register Button")
    public void user_clicks_on_register_Button() {
        driver.findElement(By.name("Submit")).click();
    }

 

    @Given("user checks for confirmation")
    public void user_checks_for_confirmation() {
        Assert.assertEquals("Login", driver.getTitle());
        System.out.println("Completed");
    }
    
    
    //Case Study 2
    @Given("user clicks on SignIn Link")
    public void user_clicks_on_SignIn_Link() {
        driver.findElement(By.linkText("SignIn")).click();
    }

 

    @Given("user enters with case username as {string}")
    public void user_enters_with_case_username_as(String un) {
        driver.findElement(By.name("userName")).sendKeys(un);
    }

 

    @Given("user enters with case password as {string}")
    public void user_enters_with_case_password_as(String psd) {
        driver.findElement(By.name("password")).sendKeys(psd);
    }

 

    @Given("user clicks case Login button")
    public void user_clicks_case_Login_button() {
        driver.findElement(By.name("Login")).click();
    }

 

    @Given("user checks for case{int} login page")
    public void user_checks_for_case_login_page(Integer int1) {
        Assert.assertEquals("Home", driver.getTitle());
    }
    @Given("user closes the browser")
    public void user_closes_the_browser() {
        driver.close();
    }
    @Given("user enters the case{int} search element as {string}")
    public void user_enters_the_case_search_element_as(Integer int1, String search) throws InterruptedException {
        driver.findElement(By.name("products")).sendKeys(search);
        //Thread.sleep(40000);
    }

 

    @Given("user clicks on the case{int} suggestion")
    public void user_clicks_on_the_case_suggestion(Integer int1) throws InterruptedException {
        //.sleep(40000);
        driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/div/div[1]")).click();
    }

 

    @Given("user clicks on case{int} search button")
    public void user_clicks_on_case_search_button(Integer int1) {
        driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
    }
    @Given("user searches for case view cart")
    public void user_searches_for_case_view_cart() {
        
    }

 

    @Given("user clicks case add to cart")
    public void user_clicks_case_add_to_cart() {
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/center/a")).click();
    }

 

    @Given("user clicks case view cart")
    public void user_clicks_case_view_cart() {
        driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]")).click();
    }
    
    @Given("user clicks on case checkout")
    public void user_clicks_on_case_checkout() {
        driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
    }

 

    @Given("user enters with case address")
    public void user_enters_with_case_address() {
        driver.findElement(By.name("ShippingAdd")).sendKeys("Hyderabad");
    }

 

    @Given("user clicks on proceed to pay")
    public void user_clicks_on_proceed_to_pay() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
        Thread.sleep(10000);
    }

 

    @Given("user selects case bank")
    public void user_selects_case_bank() {
        driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
    }

 

    @Given("user clicks on case continue")
    public void user_clicks_on_case_continue() {
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/a")).click();
    }

 

    @Given("user enters case bank username as {string}")
    public void user_enters_case_bank_username_as(String bun) {
        driver.findElement(By.name("username")).sendKeys(bun);
    }

 

    @Given("user enters case bank password as {string}")
    public void user_enters_case_bank_password_as(String bpsd) {
        driver.findElement(By.name("password")).sendKeys(bpsd);
    }

 

    @Given("user clicks on case Proceed")
    public void user_clicks_on_case_Proceed() {
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/input")).click();
    }

 

    @Given("user enters Transaction password as {string}")
    public void user_enters_Transaction_password_as(String tpsd) {
        driver.findElement(By.name("transpwd")).sendKeys(tpsd);
    }

 

    @Given("user clicks case Pay")
    public void user_clicks_case_Pay() {
        driver.findElement(By.xpath("//*[@value='PayNow']")).click();
    }

 

    @Given("user verifies for sucess page")
    public void user_verifies_for_sucess_page() {
        Assert.assertEquals(driver.getTitle(), "Order Details");
    }
}
 