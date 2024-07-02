package org.restapirunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/RestApiFeature/RestApi.feature", glue = "org.restapistepdef", monochrome = true)

@Test
public class restApiRunner {

}
