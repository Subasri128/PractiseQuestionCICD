package javabasicprograms;

public class BicycleParent {

	int chain;
	int gearbox;

	public BicycleParent(int chain, int gearbox) {
		this.chain = chain;
		this.gearbox = gearbox;
	}

	public void accelerate(int increament) {
		gearbox = gearbox + increament;
	}

	public void brake(int decreament) {
		gearbox = gearbox - decreament;
	}

	public String inResult() {
		return ("chain" + chain + "gearbox" + gearbox);
	}

}
