package test;
//inheritance
public class Childclass2 extends Childclass3 {
	int a;
	
	public Childclass2(int a) {
		super(a);
		this.a=a;
	}
	public int increment() {
		a=a+1;
		return a;
		
	}
	public int decrement() {
		a=a-2;
		return a;
		
	}

}
