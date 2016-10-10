package com.hcs.facade;

public class ShapeFacade {
	
	private Circle circle;
	private Rectangle rectangle;
	private Triangle triangle;
	
	public ShapeFacade(){
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.triangle =  new Triangle();
	}
	
	public void drawShape(){
		this.circle.draw();
		this.rectangle.draw();
		this.triangle.draw();
	}

}
