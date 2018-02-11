package com.singleton;

public class Singleton {
private static Singleton singletonInstance;

private Singleton() {
	System.out.println("Inside the private constructor of Singleton class");
}

public static Singleton getSingletonInstance() {
	if(null == singletonInstance) {
		singletonInstance = new Singleton();
		System.out.println("Inside the null check of the Singleton class :"+ singletonInstance.toString());
	}
	return singletonInstance;
}

public void printSingletonInstance() {
	System.out.println("Inside the print function :"+singletonInstance.toString());
}
}
