package com.decorator;

public class BMWCar implements Car {
	private final String Carname = "BMW";
	private String CarBody;
	private String CarDoors;
	private String CarGlasses;
	private String CarWheels;
	private String Engine;

	public String getCarname() {
		return Carname;
	}

	public String getCarBody() {
		return CarBody;
	}

	public void setCarBody(String carBody) {
		CarBody = carBody;
	}

	public String getCarDoors() {
		return CarDoors;
	}

	public void setCarDoors(String carDoors) {
		CarDoors = carDoors;
	}

	public String getCarGlasses() {
		return CarGlasses;
	}

	public void setCarGlasses(String carGlasses) {
		CarGlasses = carGlasses;
	}

	public String getCarWheels() {
		return CarWheels;
	}

	public void setCarWheels(String carWheels) {
		CarWheels = carWheels;
	}

	public String getEngine() {
		return Engine;
	}

	public void setEngine(String engine) {
		Engine = engine;
	}

	@Override
	public String toString() {
		return "BMWCar [Carname=" + Carname + ", CarBody=" + CarBody + ", CarDoors=" + CarDoors + ", CarGlasses="
				+ CarGlasses + ", CarWheels=" + CarWheels + ", Engine=" + Engine + "]";
	}

	@Override
	public Car manufactureCar() {
		 this.CarBody = "carbon fiber material";
		 this.CarDoors = "4 car doors";
		 this.CarGlasses = "6 car glasses";
		 this.CarWheels = "4 MRF wheels";
		 return this;
	}
	

}
