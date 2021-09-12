package com.company.groupProject.Task1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea(4);
        shape.calculatePerimeter(4);

        Shape shape1 = new Square();
        shape1.calculateArea(5);
        shape1.calculatePerimeter(5);
    }

}
