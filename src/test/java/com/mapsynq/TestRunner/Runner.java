package com.mapsynq.TestRunner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		 features="src/test/resources/Features",
		 glue= {"com.mapsynq.StepDef"},
		 tags = {"@Sanity"},
		 plugin = {"pretty", "html:target/cucumber-html-report"},
		 monochrome=true
		)
@Test
public class Runner extends AbstractTestNGCucumberTests
{

	

}
