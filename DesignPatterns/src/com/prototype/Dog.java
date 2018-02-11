package com.prototype;

public class Dog implements Animal{
	private String name;
	private int age;
	private String color;
	private DogEar dogear;
	private DogEye dogeye;
	private DogLegs doglegs;

	public Dog(String name, int age, String color, DogEar dogear, DogEye dogeye, DogLegs doglegs) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.dogear = dogear;
		this.dogeye = dogeye;
		this.doglegs = doglegs;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public DogEar getDogear() {
		return dogear;
	}


	public void setDogear(DogEar dogear) {
		this.dogear = dogear;
	}


	public DogEye getDogeye() {
		return dogeye;
	}


	public void setDogeye(DogEye dogeye) {
		this.dogeye = dogeye;
	}


	public DogLegs getDoglegs() {
		return doglegs;
	}


	public void setDoglegs(DogLegs doglegs) {
		this.doglegs = doglegs;
	}
	
	public Animal clone() {
		Dog dogObject =null;
		
		try 
		{
			dogObject = (Dog) super.clone();
		}
		
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return dogObject;
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", color=" + color + ", dogear=" + dogear + ", dogeye=" + dogeye
				+ ", doglegs=" + doglegs + "]";
	}
		
}
