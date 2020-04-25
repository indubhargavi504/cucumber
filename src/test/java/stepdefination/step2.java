package stepdefination;

import cucumber.api.java.en.Given;

public class step2 {
	
	
	
	@Given("User navigates to demowebshop on chrome")
	public void user_navigates_to_demowebshop_on_chrome() {
	    
		System.out.println("user navigates to demowebshop");
	}

	@Given("user enter login credentials")
	public void user_enter_login_credentials() {
	    
		System.out.println("user entered product name as");
	}

	@Given("user perform logout")
	public void user_perform_logout() {
	    
		System.out.println("Verified success");
	}

	@Given("close the browser")
	public void close_the_browser() {
	    System.out.println("close the browser");
		
	}

	@Given("user navigates to demoshop on chrome")
	public void user_navigates_to_demoshop_on_chrome() {
		
		System.out.println("user navigates to demoshop");
	    
		
	}

	@Given("user enter {string} in search store")
	public void user_enter_in_search_store(String productname) {
	    
		
		System.out.println("user entered product name as"+productname);
	}

	@Given("verify whether the application displayed with computer product")
	public void verify_whether_the_application_displayed_with_computer_product() {
	
		System.out.println("verified sucess");
	}

	@Given("user adding product")
	public void user_adding_product() {
		
		System.out.println("user added product successfull");
	
	}

	@Given("user proceeding to payment")
	public void user_proceeding_to_payment() {
	
		System.out.println("user procceding to payment");
	}

	@Given("close browser")
	public void close_browser() {
	
		System.out.println("close browser");
	}

}
