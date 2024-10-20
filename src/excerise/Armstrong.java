package excerise;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num1=371;
	int num2=num1;
	int temp1=0;
	while(num1>0) {
		int a = num1%10;
		temp1= temp1+(a*a*a);
		num1=num1/10;
		
	}
	System.out.println(temp1);
	if(temp1==num2) {
		System.out.println("armstrong");
	}
	else {
		System.out.println("not armstrong");
	}
	}

	}


