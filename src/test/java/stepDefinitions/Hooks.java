package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
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
}
