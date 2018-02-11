package com.prototype;

public class DogLegs {
	private int numberOfLegs;

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	@Override
	public String toString() {
		return "number of Legs :"+numberOfLegs;
	}

}
