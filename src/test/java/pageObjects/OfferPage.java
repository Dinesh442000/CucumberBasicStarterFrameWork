package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	By searchItem = By.id("search-field");
	By productName = By.cssSelector("tr td:nth-child(1)");
	
	public WebDriver driver;
	
	public OfferPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterSearchItem(String name) {
		driver.findElement(searchItem).sendKeys(name);
	}

	public String getProductName() {
		return driver.findElement(productName).getText();
	}
}
