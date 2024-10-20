package javaConcepts;

public class ParkingFeeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateCost(1,1);
		calculateCost(-2,1);
		calculateCost(2,-1);
		

	}
	
	public static void calculateCost(int hours, int minutes) {
		if(hours <1 || minutes<1) {
			System.out.println("Invalid");
		}
		if(minutes>59) {
			System.out.println("Not valid minute");
		}
		if(minutes <=15) {
			System.out.println("5");
		}
		if(minutes >=15 ||  hours<=2) {
			System.out.println("10");
		}
		if(hours>2) {
		System.out.println("15");
		}
	}

}
