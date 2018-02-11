package com.prototype;

public class DogEye {
	private int NumberOfEyes;

	public int getNumberOfEyes() {
		return NumberOfEyes;
	}

	public void setNumberOfEyes(int numberOfEyes) {
		NumberOfEyes = numberOfEyes;
	}
	
	@Override
	public String toString() {
		return "number of eyes:"+NumberOfEyes;
	}

}
