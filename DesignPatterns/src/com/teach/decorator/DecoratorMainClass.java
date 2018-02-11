package com.teach.decorator;

public class DecoratorMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape blueCircle = new BlueShapeDecorator(new Circle());
		
		System.out.println("Creating new blue circle");
		blueCircle.draw();

	}

}
