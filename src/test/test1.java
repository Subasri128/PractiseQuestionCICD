package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {
	
	@AfterClass
	public void after(){
		System.out.println("After class");
	}
	
	@BeforeClass
	public void before(){
		System.out.println("Before class");
	}
	@DataProvider
	public Object[][] getData()
	{
		//Give data:
		Object[][] data = new Object[3][2];
		
		data[0][0]= "firstusername";
		data[0][1]= "password";
		data[1][0]= "secondusername";
		data[1][1]= "secondpassword";
		data[2][0]= "thirdusername";
		data[2][1]= "thirdpassword";
		return data;
	}
	
	@Test(dataProvider="getData")
	public void demo5(String username, String password){
		System.out.println("example for data provider");
		System.out.println(username);
		System.out.println(password);
	}

@Test(groups= {"Smoketest"})
	
	public void demo3(){
		System.out.println("Eclipse");
	}
	
	public class test2 {
		
		@Test
		public void demo4(){
			System.out.println("Spring");
		}

	@BeforeSuite
	public void suite(){
		System.out.println("Before Execution");
	}
	
	@BeforeMethod
	public void suite2(){
		System.out.println("Before Method");
	}
	
	
	@AfterMethod
	public void suite3(){
		System.out.println("After Method");
	}
	
	@AfterSuite
	public void suite1(){
		System.out.println("After Execution");
		
	}
	

	}}
