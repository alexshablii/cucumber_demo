package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/ui"}, glue = "ui", plugin = {"pretty", "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber", "html:target/cucumber-html", "json:target/report.json"})
public class UITestRunner extends AbstractTestNGCucumberTests {
}
