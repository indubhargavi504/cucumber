package stepdefination;

import cucumber.api.java.en.Given;

public class step3 {
	
	@Given("User perform login")
	public void user_perform_login() {
		
	    System.out.println("login");
	}

	@Given("user perform search product available in cart")
	public void user_perform_search_product_available_in_cart() {
		
		 System.out.println("search");
	    
	}

	@Given("user selects the product")
	public void user_selects_the_product() {
		
		 System.out.println("add products");
	
	}

	@Given("user is moving the product to cart")
	public void user_is_moving_the_product_to_cart() {
		
		 System.out.println("payment");

	}

	@Given("user closing browser")
	public void user_closing_browser() {

		 System.out.println("close");
		
	}

}
