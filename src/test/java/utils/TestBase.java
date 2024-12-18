package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
	
	public WebDriver webDriverManager() {
		if(driver==null) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		}
		 return driver;
	}
}