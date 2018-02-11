package com.decorator;

public class DieselCarDecorator extends CarDecorator{
	public DieselCarDecorator(Car car) {
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
			BMW_Car_Object.setEngine("Diesel Engine");
			System.out.println("DieselCarDecorator added Diesel Engine to the Car : " + car);
		}
	}

}
