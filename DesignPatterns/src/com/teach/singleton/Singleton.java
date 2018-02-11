package com.teach.singleton;

public class Singleton {
	// one static member to hold the instance of the Singleton class
	private static Singleton singletonInstance;
	
	// to avoid other classes instantiating or inheritigng
	private Singleton() {
		//do something
	}
	
	//one globally accessible getinstance method
	public static Singleton getSingletonInstance() {
		if(null == singletonInstance) {
			singletonInstance = new Singleton();
			System.out.println("Inside null check: Created new object of Singleton class:"+singletonInstance.toString());
			System.out.println("----------------------------------------------------------");
		}
		return singletonInstance;
	}
	
	public void printSingleton() {
		System.out.println("Inside print Singleton object:"+singletonInstance.toString());
	}
}
