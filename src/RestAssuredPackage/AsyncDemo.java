package RestAssuredPackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.asynchttpclient.Dsl;

import io.restassured.response.Response;

public class AsyncDemo {
	
	 public static void main(String[] args) throws InterruptedException, ExecutionException {
		 
		 Future<org.asynchttpclient.Response> responseFuture = Dsl.asyncHttpClient().prepareGet("https://regres.in/api/users?delay=5").execute();
		org.asynchttpclient.Response response = responseFuture.get();
		
		System.out.println(response);
		System.out.println(response.getStatusCode());
		
		 
		 
		 
	 }

}
