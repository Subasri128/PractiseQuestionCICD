package RestAssuredPackage;
 
import org.testng.annotations.*;
import io.restassured.*;

public class start {
	
	@BeforeSuite
	void setupConfig() {
		System.out.println("Test Initialization");
	}
	
	@Test
	void testExecution() {
		RestAssured.baseURI = "https://integration.multibrand.servicebox-parts.com/fr/vehicles";
		RestAssured.basePath="9465";
		
		RestAssured.given().when().get().then().log().all().statusCode(200).body("result", null);
	}
	


	@AfterSuite
	void EndTestConfig() {
		System.out.println("Test Completion");
	}
	
	
	
	

}
