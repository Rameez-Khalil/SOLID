package com.single_resp;

public class Rectangle implements Shape{
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double calculateArea(){
        System.out.println("Rectangle class");
        return length*breadth;
    }

}
