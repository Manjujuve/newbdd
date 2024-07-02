package org.restapistepdef;

import org.junit.runner.Request;
import org.restapitest.restapitest.RestApiBaseclass;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restApiStepdef extends RestApiBaseclass {

	private Response response;

	@Test
	@Given("I have API endpoint")
	public void i_have_api_endpoint() {

		BaseAPI("https://reqres.inṇ/");
		
//		RestAssured.baseURI = "https://reqres.in/";
//		RestAssured.given();

	}

	@Test(enabled = false)
	@When("I send a GET request")
	public void i_send_a_get_request() {

		BaseAPI("https://reqres.in/");
		response = get("api/user?page=2&id=7");
	
		checkStatusCode(response, 200);
		System.out.println(response.asString());

	}

	@Test
	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be(Integer int1) {

		BaseAPI("https://reqres.in/");
		
		checkStatusCode(response, 200);
		System.out.println(response.asString());
 
	}

}
