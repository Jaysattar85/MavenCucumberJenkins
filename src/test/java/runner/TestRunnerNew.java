package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class TestRunnerNew {

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/features" 
					,glue= {"stepDefinitions"} 
					,plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json"})
	public class TestRunner {

		

	}
}
