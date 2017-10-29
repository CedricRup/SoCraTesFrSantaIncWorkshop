package com.santa;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/specs/resources/specs", tags = {"~@ignore"}, strict = true)
public class RunCukesTest {
}