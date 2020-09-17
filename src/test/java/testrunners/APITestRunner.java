package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/api"}, glue = "api", plugin = {"pretty", "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber", "html:target/cucumber-html", "json:target/report.json"})
public class APITestRunner extends AbstractTestNGCucumberTests {

}
