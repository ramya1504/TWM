package com.teach.prototype;

public class DogEar {
	private int numberOfEars;

	/**
	 * @return the numberOfEars
	 */
	public int getNumberOfEars() {
		return numberOfEars;
	}

	/**
	 * @param numberOfEars the numberOfEars to set
	 */
	public void setNumberOfEars(int numberOfEars) {
		this.numberOfEars = numberOfEars;
	}
	
	@Override
	public String toString() {
		return "DogEar [ number of Ears="+numberOfEars+"]";
	}
}
