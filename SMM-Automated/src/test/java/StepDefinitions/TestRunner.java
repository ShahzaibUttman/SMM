package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/Hajra/git/repository/SMM-Automated/src/test/resources/Features", 
		glue= {"StepDefinitions"},
		monochrome = true,
		plugin = {
				"pretty", 
				"junit:target/JUnitReports/report.junit",
				"json:target/JSONReports/report.json",
				"html:target/HTMLReports/report.html"
		}
		)
public class TestRunner {


}
