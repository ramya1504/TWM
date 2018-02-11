package com.shape.decorator;

public class BlueShapeDecorator extends ShapeDecorator{
	 public BlueShapeDecorator(Shape decoratedShape) {
		 super(decoratedShape);
	 }

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();
		setColor(decoratedShape);
	}

	private void setColor(Shape decoratedShape) {
		System.out.println("Blue color has been applied to"+decoratedShape);
		
	}
	 
}
