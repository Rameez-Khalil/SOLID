package com.open_closed;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        System.out.println("Circle");
        return Math.pow(radius, 2) * 3.142;
    }
}
