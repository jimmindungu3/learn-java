package com.james;

public class Shape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        shape.draw();
        circle.draw();
        rectangle.draw();
    }

    public void draw() {
        System.out.println("Draw some shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }
}

