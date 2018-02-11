package com.prototype;

import java.util.Hashtable;

public class AnimalCache {
	private static Hashtable<String,Animal> AnimalList = new Hashtable<String,Animal>();
	
	public static Animal getAnimal(String animalType) {
		Dog dog = (Dog) AnimalList.get(animalType);
		
		if(null == dog) {
			DogLegs doglegs = new DogLegs();
			doglegs.setNumberOfLegs(4);
			
			DogEar dogear = new DogEar();
			dogear.setNumberOfEars(2);
			
			DogEye dogeye = new DogEye();
			dogeye.setNumberOfEyes(2);
			
			dog = new Dog("Tommy",6,"White",dogear,dogeye,doglegs);
			AnimalList.put("dog", dog);
			System.out.println("New dog object is created");
			return dog;
		}
		System.out.println("Cloned object returned");
		return dog.clone();
	}
}
