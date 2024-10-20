package javabasicprograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class oddeven {
	
	@Test
	public void oddeven1(){	
		int x = 102;
		if(x%2==0)
		{
			System.out.println(x+"even");
		}
		else {
			System.out.println(x+"odd");
		}}
	
	@Test
	public void multiply() {
		double a=33.33 , b=339.44;
		double c = a*b;
		System.out.println(c);
		
	}
	@Test
	public void leapyear() {
		int a= 2024;
		if(a%4==0) {
			System.out.println(a +"leap year");
		}
		else {
			System.out.println(a +"not leap");
		}
	}
	

}
