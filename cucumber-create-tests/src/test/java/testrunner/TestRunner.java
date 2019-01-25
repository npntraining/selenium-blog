package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="C:\\Selenium\\Selenium-NPN\\cucumber-create-tests\\src\\test\\java\\features",
		glue="stepdefinitions",
		plugin= {"pretty","html:HTML-Reports"},
		monochrome=true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
