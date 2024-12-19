package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public WebDriver driver;
	
	

	public WebDriver webDriverManager() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		System.out.println(fis.toString());
		if(driver==null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
				//System.setProperty("webdriver.edge.driver", "C://Users//DChoudhary5//Documents//msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get(url);
		
		}
		 return driver;
		}
		
}

