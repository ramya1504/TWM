package com.teach.decorator;

public class BlueShapeDecorator extends ShapeDecorator{
	public BlueShapeDecorator( Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setColor(decoratedShape);
		
	}

	private void setColor(Shape decoratedShape) {
		// TODO Auto-generated method stub
		System.out.println("Blue color applied");
	}	
	
}
