package runnertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Owner\\eclipse-workspace\\BDD_LMS_Cucumber_V001\\Features", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:target/MyReports/reports.html", "json:target/MyReports/reports.json" })
public class Runner_Class {

}
