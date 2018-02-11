package com.prototype;

public class DogEar {
	private int numberOfEars;

	public int getNumberOfEars() {
		return numberOfEars;
	}

	public void setNumberOfEars(int numberOfEars) {
		this.numberOfEars = numberOfEars;
	}
	
	@Override
	public String toString() {
		return "number of ears:"+numberOfEars;
	}

}
