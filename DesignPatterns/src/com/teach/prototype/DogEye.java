package com.teach.prototype;

public class DogEye {
	private int numberOfEyes;

	/**
	 * @return the numberOfEyes
	 */
	public int getNumberOfEyes() {
		return numberOfEyes;
	}

	/**
	 * @param numberOfEyes the numberOfEyes to set
	 */
	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}
	@Override
	public String toString() {
		return "DogEyes [number of Eyes = "+numberOfEyes+"]";
	}

}
