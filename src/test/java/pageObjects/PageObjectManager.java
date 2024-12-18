package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingPage;
	public OfferPage offerPage;
	public CartPage cartPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage offerPage() {
		offerPage = new OfferPage(driver);
		return offerPage;
	}
	
	public CartPage cartPage() {
		cartPage = new CartPage(driver);
		return cartPage;
	}
}
