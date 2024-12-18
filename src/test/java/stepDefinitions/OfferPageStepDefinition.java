package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;


public class OfferPageStepDefinition {

	public String offerPageProductName;
	public TestContextSetup testConceptSetup;
	public PageObjectManager pageObjectManager;
	
	public OfferPageStepDefinition(TestContextSetup testConceptSetup) {
		this.testConceptSetup = testConceptSetup;
	}
	
	//@Then("user searched for {string} shortname in offers page")
	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		switchToOffersPage();
		
		//OfferPage offerPage = new OfferPage(testConceptSetup.driver);
		OfferPage offerPage = testConceptSetup.pageObjectManager.offerPage();
		offerPage.enterSearchItem(shortName);
		//testConceptSetup.driver.findElement(By.id("search-field")).sendKeys(shortName);
		Thread.sleep(2);
		offerPageProductName = offerPage.getProductName();
	}
	
	public void switchToOffersPage() {
		//if already switched then dont switch add this condition
		//if(testConceptSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		//pageObjectManager = new PageObjectManager(testConceptSetup.driver);
		LandingPage landingPage = testConceptSetup.pageObjectManager.getLandingPage();
		//LandingPage landingPage = new LandingPage(testConceptSetup.driver);
		
		landingPage.selectTopDealsPage();
		//testConceptSetup.driver.findElement(By.linkText("Top Deals")).click();
		testConceptSetup.genericUtils.switchWindowToChild();
	}
	
	@And("validate product name in offers page matches with Landing page")
	public void validateThedata() {
		Assert.assertEquals(offerPageProductName, testConceptSetup.landingPageProductName);
	}
}
