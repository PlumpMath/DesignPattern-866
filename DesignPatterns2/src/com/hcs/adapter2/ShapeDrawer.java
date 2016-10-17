package com.hcs.adapter2;

import com.hcs.adapter.ShapeDrawable;

public class ShapeDrawer implements ShapeDrawable {

	private Shape shape;

	public ShapeDrawer(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void drawPerimeter() {
		shape.perimter();

	}

	@Override
	public void drawArea() {
		shape.area();
	}

}
