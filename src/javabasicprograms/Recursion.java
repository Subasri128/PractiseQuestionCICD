package javabasicprograms;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = mul(10);
		System.out.println(result);
}
	public static int mul(int i) {
		if(i>0) {
			return i+mul(i-1);
		}
		else {
		return i;
		}
	}

}
