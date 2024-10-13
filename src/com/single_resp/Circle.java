package com.single_resp;

public class Circle implements Shape{

    //Composition
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.142 * Math.pow(radius,2);
    }
}
