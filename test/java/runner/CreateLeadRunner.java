package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/CreateLead.feature",
			     glue="stepDefinition",
				 monochrome = true,
				 publish = true)
public class CreateLeadRunner extends AbstractTestNGCucumberTests {

}
