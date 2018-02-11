package com.decorator;

public class DecoratorMainClass {

	public static void main(String[] args) {
		Car bmwCar1 = new BMWCar();
		System.out.println("BMW Car number 1 :" + bmwCar1);
		DieselCarDecorator carWithDieselEngine = new DieselCarDecorator(bmwCar1);
		carWithDieselEngine.manufactureCar();
		System.out.println("---------------------------------------------------------------------------------");
		
		Car bmwCar2 = new BMWCar();
		System.out.println("BMW Car number 2:" + bmwCar2);
		PetrolCarDecorator carWithPetrolEngine = new PetrolCarDecorator(bmwCar2);
		carWithPetrolEngine.manufactureCar();
	}

}
