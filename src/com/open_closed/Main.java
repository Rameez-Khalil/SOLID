package com.open_closed;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10,10);
        Shape circle = new Circle(10);

        ShapeRunner shape = new ShapeRunner();
        shape.drawShape(rectangle);
        shape.drawShape(circle);
    }
}
