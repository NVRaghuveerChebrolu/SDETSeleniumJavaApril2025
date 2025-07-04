package BDDtestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="@target/rerun.txt",
	glue= {"com.BDD"},
	tags = "@GmoRegression",
	plugin= {
			"pretty",
			"html:target/cucumber-reports.html",
			"rerun:target/rerun.txt"
			},
	//dryRun=true,
	monochrome=true
		)
public class TestReRunner {
}
