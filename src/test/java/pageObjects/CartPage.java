package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	
	WebDriver driver;
	
	By getActualQuantity = By.xpath("//td/p[@class=\"quantity\"]");
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public String getQuantity() {
		return driver.findElement(getActualQuantity).getText();
	}
}
