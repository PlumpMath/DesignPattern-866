package com.hcs.adapter2;

public class Drive {

	public static void main(String[] args) {
		ShapeDrawer shapeDrawer = new ShapeDrawer(new Rectangle());
		shapeDrawer.drawArea();
		shapeDrawer.drawPerimeter();
		
		shapeDrawer = new ShapeDrawer(new Circle());
		shapeDrawer.drawArea();
		shapeDrawer.drawPerimeter();
		
		
	}

}
