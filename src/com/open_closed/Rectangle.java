package com.open_closed;

public class Rectangle implements Shape {

    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        System.out.println("Rectangle");
        return breadth * length;
    }
}
