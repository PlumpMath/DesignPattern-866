package com.hcs.facade;

public class ShapeFacade {

    private Shape circle;
    private Shape rectangle;
    private Shape triangle;

    public ShapeFacade() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.triangle = new Triangle();
    }

    public void drawCircle() {
        this.circle.draw();
    }

    public void drawRectangle() {
        this.rectangle.draw();
    }

    public void drawTriangle() {
        this.triangle.draw();
    }
    
    public void drawAllShape(){
    	System.out.println("draw all shape");
    	this.circle.draw();
    	this.rectangle.draw();
    	this.triangle.draw();
    }

}
