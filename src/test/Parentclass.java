package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Parentclass {
	public void Airplaneseries() {
		System.out.println("Airplane in line");
	}
	@BeforeMethod
	public void Airplanesnames() {
		System.out.println("Airplane launch");
	}
	@AfterMethod
	public void Airplanessignoff() {
		System.out.println("Airplane logoff");
	}
	
}
