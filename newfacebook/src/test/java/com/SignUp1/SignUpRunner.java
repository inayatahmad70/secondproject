package com.SignUp1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/com/SignUp/features/SignUp.feature",tags="@Test",
plugin = {"html:target/cucmber.html.reporty"},
dryRun=false)

public class SignUpRunner {


}
