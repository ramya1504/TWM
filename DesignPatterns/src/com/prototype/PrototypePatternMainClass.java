package com.prototype;

public class PrototypePatternMainClass {

	public static void main(String[] args) {
		Dog dog = (Dog) AnimalCache.getAnimal("dog");
		displayAnimalProperties(dog);
		
		Dog clonedDog1 = (Dog) AnimalCache.getAnimal("dog");
		clonedDog1.setName("Jimmy");
		displayAnimalProperties(clonedDog1);
	}
	public static void displayAnimalProperties(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println(dog.toString());
			System.out.println("---------------------------------------------------------");
			
		}
	}

}
