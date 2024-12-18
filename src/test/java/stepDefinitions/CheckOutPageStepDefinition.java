package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CartPage;

import utils.TestContextSetup;

public class CheckOutPageStepDefinition {

	
	TestContextSetup testConceptSetup;
	CartPage cartPage;
	
	public CheckOutPageStepDefinition(TestContextSetup testConceptSetup) {
		this.testConceptSetup = testConceptSetup;
	}

	
	@Then("validate product name in cart page matches with Landing page")
	public void validate_product_name_in_cart_page_matches_with_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		cartPage = testConceptSetup.pageObjectManager.cartPage();
		String inTableValue = cartPage.getQuantity();
		Assert.assertEquals(inTableValue, testConceptSetup.quantity);
	    
	}
}
