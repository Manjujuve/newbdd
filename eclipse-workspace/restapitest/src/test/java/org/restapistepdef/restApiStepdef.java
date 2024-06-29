package org.restapistepdef;

import org.junit.runner.Request;
import org.restapitest.restapitest.RestApiBaseclass;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restApiStepdef extends RestApiBaseclass  {
	
	
	private Response response;
	
	@Given("I have API endpoint {string}")
	public void i_have_api_endpoint(String string) {
		
		BaseAPI("https://reqres.in/");
	    
	}
	@When("I send a GET request")
	public void i_send_a_get_request() {
		
		 response  = get("api/users/2");
	    
	}
	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be(Integer int1) {
		
		checkStatusCode(response, 200);
	   
	}





}
