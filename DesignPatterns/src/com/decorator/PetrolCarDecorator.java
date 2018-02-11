package com.decorator;

public class PetrolCarDecorator extends CarDecorator{
	public PetrolCarDecorator(Car car) {
		super(car);
	}
	public Car manufactureCar() {
		car.manufactureCar();
		addEngine(car);
		return car;
	}
	public void addEngine(Car car) {
		if(car instanceof BMWCar) {
			BMWCar BMW_Car_Object = (BMWCar) car;
			BMW_Car_Object.setEngine("Petrol Engine");
			System.out.println("PetrolCarDecorator added Petrol Engine to the Car : " + car);
		}
	}
	

}
