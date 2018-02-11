package com.teach.prototype;

public class DogLeg {
	private int numberOfLegs;

	/**
	 * @return the numberOfLegs
	 */
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	/**
	 * @param numberOfLegs the numberOfLegs to set
	 */
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	@Override
	public String toString() {
		return "number of Legs ="+numberOfLegs+"]";
	}
}
