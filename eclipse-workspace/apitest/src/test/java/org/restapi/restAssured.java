package org.restapi;


import org.testng.annotations.Test;

//import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssured {
	@Test(enabled = false)
	public void restAssuredGet() {

		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification requestSpecification = RestAssured.given();

		Response response = requestSpecification.request(Method.GET,"api/users?page=2");

		System.out.println(response.statusLine());
		System.out.println(response.asPrettyString());
	}
	
	@Test(enabled = false)
	public void restAssuredPost() {
		
		RestAssured.baseURI = "https://reqres.in/"; 
		
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}");
		
		Response response = requestSpecification.request(Method.POST,"api/users");
		
		System.out.println(response.statusLine());
		System.out.println(response.asPrettyString());
		
	}
	
	@Test
	public void restAssuredPut() {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}");
				
		
		Response response = requestSpecification.request(Method.PUT,"api/users/2");
		
		System.out.println(response.statusLine());
		System.out.println(response.asPrettyString());
	}
	
	
	
	






}
