package com.singleton;

public class SingletonPatternMainClass {

	public static void main(String[] args) {
		Singleton.getSingletonInstance().printSingletonInstance();
		Singleton.getSingletonInstance().printSingletonInstance();
		Singleton.getSingletonInstance().printSingletonInstance();

	}

}
