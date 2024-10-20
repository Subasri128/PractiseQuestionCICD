package javaConcepts;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 90;
		int b=a;
		int rem=0;
		while(a>0) {
			int c = a%10;
			rem =rem+(c*c*c);
			a=a/10;
		}
		System.out.println(rem);
		if(rem==b) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
		

	}

}
