package com.teach.prototype;

public class DogTail {
	private String tailLength;

	/**
	 * @return the tailLength
	 */
	public String getTailLength() {
		return tailLength;
	}

	/**
	 * @param tailLength the tailLength to set
	 */
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	@Override
	public String toString() {
		return "Dog Tail length = "+tailLength+"]";
	}
}
