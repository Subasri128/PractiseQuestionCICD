package RestAssuredPackage;

import org.json.simple.JSONObject;
import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class learning1 {

@Test(enabled=false)

public void getBookDetails() {
	
	RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.GET,"");
	System.out.println("Status received => "+response.getStatusLine());
	System.out.println("Response =>"+response.prettyPrint());
	
}

@Test
public void postUserRegister() {
	RestAssured.baseURI = "https://demoqa.com/Account/v1";
	RequestSpecification httpRequest = RestAssured.given();
	JSONObject requestParams = new JSONObject();
	requestParams.put("userName", "test_account");
	requestParams.put("password", "TestPassword123");
	httpRequest.body(requestParams.toJSONString());
	Response response = httpRequest.put("/User");
	ResponseBody body = response.getBody();
	System.out.println(response.getStatusLine());
	System.out.println(response.getStatusCode());
	System.out.println(body.asString());
	
	
}

}
