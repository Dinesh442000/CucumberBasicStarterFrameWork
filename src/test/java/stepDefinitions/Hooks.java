package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
	TestContextSetup testConceptSetup;
	public Hooks(TestContextSetup testConceptSetup) {
		this.testConceptSetup =testConceptSetup;
	}
	
	@After
	public void afterScenario() throws IOException {
		testConceptSetup.testBase.webDriverManager().quit();;
	}
	
	@AfterStep
	public void getScreenShotOnFail(Scenario scenario) throws IOException {
		WebDriver driver = testConceptSetup.testBase.webDriverManager();
		if(scenario.isFailed()) {
			File srcScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(srcScreenShot);
			scenario.attach(fileContent, "image/png", "image");
		}
	}
	
}
