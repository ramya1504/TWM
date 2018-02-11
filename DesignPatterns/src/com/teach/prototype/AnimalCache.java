package com.teach.prototype;
import java.util.Hashtable;

public class AnimalCache
{
	private static Hashtable<String, Animal> AnimalMap = new Hashtable<String, Animal>();

	public static Animal getAnimal( String animalType )
	{
		Dog dog = (Dog) AnimalMap.get(animalType);
		if( dog == null )
		{
			DogLeg dogleg = new DogLeg();
			dogleg.setNumberOfLegs(4);

			DogEar dogear = new DogEar();
			dogear.setNumberOfEars(2);

			DogTail dogtail = new DogTail();
			dogtail.setTailLength("long");

			DogEye dogeye = new DogEye();
			dogeye.setNumberOfEyes(2);

			dog = new Dog("Tommy", 3, "White", dogleg, dogtail, dogear, dogeye);
			AnimalMap.put("dog", dog);
			System.out.println("New Dog Object is created and return\n");
			return dog;
		}
		System.out.println("\nCloned Dog Object is created and return\n");
		return dog.clone();
	}
}