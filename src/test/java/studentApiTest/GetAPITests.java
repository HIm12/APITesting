package studentApiTest;

import org.testng.annotations.Test;

import apiconfigs.APIPath;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAPITests extends BaseTest{

	@Test
	public void getAPITest() {
		
		Response response = RestAssured.given().when().get(APIPath.GET_LIST_OF_POSTS);
		
		System.out.println(response.getBody().asString());
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getCookies());
		
		System.out.println(response.getTime());
	}
}
