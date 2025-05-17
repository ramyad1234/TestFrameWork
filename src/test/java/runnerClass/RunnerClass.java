package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/Features/HomePage.feature"},
		glue = "allSteps",
		monochrome = true,
		dryRun = false,
		tags = "@product1",
		plugin = {"pretty","html:src/main/resources/CucumberReports/reports.html"}
		)

public class RunnerClass{
	
}
