package javabasicprograms;

public class fibonacci {
	
	public static int fibonacci(int i) {
		if(i<=1)
		{
			return i;
		}
		return fibonacci(i-1)+fibonacci(i-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=5;
		for(int n=0;n<i;n++) {
			System.out.println(fibonacci(n)+"");
		}

	}

}
