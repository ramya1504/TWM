package com.teach.prototype;

public class Dog implements Animal {
	 private String  name;
	 private int     age;
	 private String  color;
	 private DogLeg  dogleg;
	 private DogTail dogtail;
	 private DogEar  dogear;
	 private DogEye  dogeye;
	public Dog(String name, int age, String color, DogLeg dogleg, DogTail dogtail, DogEar dogear, DogEye dogeye) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.dogleg = dogleg;
		this.dogtail = dogtail;
		this.dogear = dogear;
		this.dogeye = dogeye;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the dogleg
	 */
	public DogLeg getDogleg() {
		return dogleg;
	}
	/**
	 * @param dogleg the dogleg to set
	 */
	public void setDogleg(DogLeg dogleg) {
		this.dogleg = dogleg;
	}
	/**
	 * @return the dogtail
	 */
	public DogTail getDogtail() {
		return dogtail;
	}
	/**
	 * @param dogtail the dogtail to set
	 */
	public void setDogtail(DogTail dogtail) {
		this.dogtail = dogtail;
	}
	/**
	 * @return the dogear
	 */
	public DogEar getDogear() {
		return dogear;
	}
	/**
	 * @param dogear the dogear to set
	 */
	public void setDogear(DogEar dogear) {
		this.dogear = dogear;
	}
	/**
	 * @return the dogeye
	 */
	public DogEye getDogeye() {
		return dogeye;
	}
	/**
	 * @param dogeye the dogeye to set
	 */
	public void setDogeye(DogEye dogeye) {
		this.dogeye = dogeye;
	}
	 
	public Animal clone()
	{
		Dog dogObject = null;
		try
		{
			dogObject = (Dog) super.clone();
		}

		catch( CloneNotSupportedException e )
		{
			e.printStackTrace();
		}

		return dogObject;
	}

	@Override
	public String toString()
	{
		return "Dog [name=" + name + ", age=" + age + ", color=" + color + ", dogleg=" + dogleg + ", dogtail="
				+ dogtail + ", dogear=" + dogear + ", dogeye=" + dogeye + "]";
	}
	 
	 

}
