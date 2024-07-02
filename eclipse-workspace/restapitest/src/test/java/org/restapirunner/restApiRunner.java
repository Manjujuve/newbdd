package org.restapirunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(features="src/test/java/RestApiFeature/RestApi.feature", glue="org.restapistepdef", monochrome = true)



public class restApiRunner {

}
