package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="com.stepdefinition",monochrome=true,dryRun=false,
plugin= {"pretty","html:src\\test\\resources\\Report\\Cucumber.html",
		"junit:src\\test\\resources\\Report\\Cucumber.xml",
		"json:src\\test\\resources\\Report\\Cucumber.json"})

public class TestRunner {

	
}
