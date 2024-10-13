package com.single_resp;

public class Main {
    public static void main(String[] args) {
        ShapeDraw shape = new ShapeDraw();

        Shape rectangle = new Rectangle(10,20);
        Shape circle = new Circle(10);

        shape.drawShape(rectangle);
        shape.drawShape(circle);
    }
}
