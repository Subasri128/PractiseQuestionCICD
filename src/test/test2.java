package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {
	
	@Test(groups= {"Smoketest"})
	public void Bussiness(){
		System.out.println("Bussinessclass");
	}
	@Parameters({"URL","Apikeyname"})
	@Test
	public void ecomomy(String name,String value){
		System.out.println("ecomomy");
		System.out.println(name);
		System.out.println(value);
	}
	
	@Test(enabled=false)
	public void wheel(){
		System.out.println("Wheel");
	}

	@Test(timeOut=4000)
	public void ticketbooking(){
		System.out.println("ticket booked");
	}
	

	@Test
	public void WindowType(){
		System.out.println("WindowType open");
	}
	

	@Test
	public void SeatType(){
		System.out.println("SeatType");
	}
	

	@Test(dependsOnMethods= {"WindowType","SeatType"})
	public void SeatPreference(){
		System.out.println("SeatPreference");
	}
	
	@Test(groups= {"excludetest"})
	public void Airside(){
		System.out.println("Airside");
	}

}
