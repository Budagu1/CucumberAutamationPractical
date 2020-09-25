package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\CucumberAutamationPractical\\features\\whiteBackground.feature",
		glue ="Test",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)
public class TestRun {

}
