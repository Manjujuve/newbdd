package org.restapitest.restapitest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestApiBaseclass {


	@Test
	public void BaseAPI(String baseUri) {

		RestAssured.baseURI= baseUri;

		RestAssured.given();

	}
	@Test
	public Response get(String endpoint) {
		return ( RestAssured.given()
				.when()
				.get(endpoint));

	}

	@Test
	public Response post(String endpoint, Object body) {
		return RestAssured.given()
				.body(body)
				.when()
				.post(endpoint);

	}

	@Test
	public Response put(String endpoint, Object body) {
		return RestAssured.given()
				.body(body)
				.when()
				.put(endpoint);
	}

	@Test
	public void checkStatusCode(Response response, int expectedStatusCode) {
		response.then()
		.statusCode(expectedStatusCode);
	}

}
