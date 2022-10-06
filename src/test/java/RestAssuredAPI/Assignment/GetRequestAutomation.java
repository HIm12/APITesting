package RestAssuredAPI.Assignment;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequestAutomation {

	@Test
	public void getRequestAutomation()
	{
		RestAssured.baseURI= "https://reqres.in/api/users";	
		RestAssured.given().param("page", "2")
		.when()
		.get()
		.then()
		.assertThat()
		.log()
		.all()
		.statusCode(200);
		}
	
}
