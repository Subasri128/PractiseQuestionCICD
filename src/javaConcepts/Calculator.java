package javaConcepts;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1,num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number1");
		num1 = scan.nextDouble();
		System.out.println("Enter number2");
	
		num2 = scan.nextDouble();
		
	System.out.println("Enter operation(+,-,*,/)");
	char operation = scan.next().charAt(0);
	double res=0;
	
	switch(operation){
	case '+':
	{
		res = num1+num2;
		break;
	}
	case '-':
	{
		res = num1-num2;
		break;
	}
	case '*':
	{
		res = num1*num2;
		break;
	}
	case '/':
	{
		res = num1/num2;
		break;
	}
	default:
		System.out.println("Enter another number ");
	
	
	}
	System.out.println();
	
	System.out.println(num1+" "+operation+ " "+num2+" = "+res);

	}

}
