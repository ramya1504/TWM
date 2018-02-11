package com.teach.decorator;

public abstract class ShapeDecorator implements Shape{
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw_ShapeDecorator() {
		
		decoratedShape.draw();
	}

}
