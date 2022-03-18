package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

//import  io.restassured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTAPI {
	
	
	@Parameters
	@Test
	public void createRequest() {
//		RestAssured.baseURI = "https://reqres.in/";
//		RestAssured.basePath = "api/users";
		
		JSONObject params = new JSONObject();
		params.put("name", "morpheus");
		params.put("job", "leader");

		
		RequestSpecification request = RestAssured.given();
		request.body(params);
		request.contentType("application/json");

		Response response = request.post("https://reqres.in/api/users");

		System.out.println(response.getStatusCode());
		JsonPath path = response.jsonPath();

		String name = path.getString("name");

		System.out.println(name);

		String jobTitle = path.getString("job");

		System.out.println(jobTitle);		
		

		
	}
	

	

	

}
