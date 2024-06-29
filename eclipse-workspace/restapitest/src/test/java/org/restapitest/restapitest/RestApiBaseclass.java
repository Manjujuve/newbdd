package org.restapitest.restapitest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiBaseclass {



	public void BaseAPI(String baseUri) {

		RestAssured.baseURI= baseUri;

		RestAssured.given();

	}

	public Response get(String endpoint) {
		return ( RestAssured.given()
				.when()
				.get(endpoint));

	}

	public Response post(String endpoint, Object body) {
		return RestAssured.given()
				.body(body)
				.when()
				.post(endpoint);

	}

	public Response put(String endpoint, Object body) {
		return RestAssured.given()
				.body(body)
				.when()
				.put(endpoint);
	}

	public void checkStatusCode(Response response, int expectedStatusCode) {
		response.then()
		.statusCode(expectedStatusCode);
	}

}
