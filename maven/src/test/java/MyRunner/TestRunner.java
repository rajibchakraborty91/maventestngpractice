package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	@RunWith(Cucumber.class)
	
	@CucumberOptions(
			features = "D:\\Java Documents\\text\\maven\\src\\main\\java\\Features", //the path of the feature files
			glue={"StepDefinitions"}, //the path of the step definition files
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml", "rerun:target/rerun.txt"}, //to generate different types of reporting
			plugin = {"pretty"},
			monochrome = true//display the console output in a proper readable format
			//it will check if any step is not defined in step definition file
			//dryRun = false //to check the mapping is proper between feature file and step def file	
			)
	public class TestRunner extends AbstractTestNGCucumberTests {
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	

