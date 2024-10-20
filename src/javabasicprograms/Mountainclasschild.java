package javabasicprograms;

public class Mountainclasschild extends BicycleParent {
	
 int height;
	public Mountainclasschild(int chain, int gearbox , int valuegiven) {
		super(chain, gearbox);
		height=valuegiven;
		// TODO Auto-generated constructor stub
	}
	public String getDetails() {
		return("Details of Cycle"+chain+" ,"+gearbox+", "+height);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mountainclasschild a =new Mountainclasschild(23, 43, 87);
		a.accelerate(89);
		a.brake(100);
		System.out.println(a.getDetails());
	}

}
