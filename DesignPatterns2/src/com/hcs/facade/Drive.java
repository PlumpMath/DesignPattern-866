package com.hcs.facade;

public class Drive {

    public static void main(String[] args) {
        System.out.println("Java version:" + System.getProperty("java.version"));

        ShapeFacade facade = new ShapeFacade();
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawTriangle();
        
        //facade
        facade.drawAllShape();

    }

}
