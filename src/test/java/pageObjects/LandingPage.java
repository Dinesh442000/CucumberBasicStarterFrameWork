package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By topDeals = By.linkText("Top Deals");
	By quantity = By.xpath("//input[@type='number']");
	By addToCart = By.xpath("//button[@type='button' and text()='ADD TO CART']");
	By cartBag = By.xpath("//a/img[@alt=\"Cart\"]");
	By checkOutButton = By.xpath("//button[@type='button' and text()='PROCEED TO CHECKOUT']");
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterSearchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDealsPage() {
		driver.findElement(topDeals).click();
	}
	
	public void enterQuantity(String itemsQuantity) {
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys(itemsQuantity);
	}
	
	public void clickOnAddToCart() {
		driver.findElement(addToCart).click();
	}
	
	public void clickOnCartBag() throws InterruptedException {
		driver.findElement(cartBag).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(checkOutButton);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	
		//driver.findElement(checkOutButton).click();
	}
//	public void clickOnCheckOut() {
//		;
//	}
	
}
