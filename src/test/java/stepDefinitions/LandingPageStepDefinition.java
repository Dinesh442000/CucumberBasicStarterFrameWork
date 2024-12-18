package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;


public class LandingPageStepDefinition {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetup testConceptSetup;
	
	public LandingPageStepDefinition(TestContextSetup testConceptSetup) {
		this.testConceptSetup = testConceptSetup;
	}

	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
//		testConceptSetup.driver = new ChromeDriver();
//		testConceptSetup.driver.manage().window().maximize();
//		 testConceptSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//testConceptSetup.pageObjectManager.getLandingPage();
		
	}
	@When("user searched with shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
	    //Write code here that turns the phrase above into concrete actions
		//LandingPage landingPage = new LandingPage(testConceptSetup.driver);
		LandingPage landingPage = testConceptSetup.pageObjectManager.getLandingPage();
		landingPage.enterSearchItem(shortName);
		//testConceptSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	    Thread.sleep(1000);
	    testConceptSetup.landingPageProductName =   landingPage.getProductName().split("-")[0].trim();
	    System.out.println("Product name extracted "+testConceptSetup.landingPageProductName);  
	}

	
	
}
