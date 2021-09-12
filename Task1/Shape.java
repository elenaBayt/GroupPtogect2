package com.company.groupProject.Task1;

public interface Shape {
    void calculateArea(int x);
    void calculatePerimeter(int x);
}

class Circle implements Shape {
    @Override
    public void calculateArea(int x) {
        System.out.println("The area of the circle with radius "+x+" is "+ Math.PI*Math.pow(x,2));
    }

    @Override
    public void calculatePerimeter(int x) {
        System.out.println("The perimeter of the circle with radius "+x+" is "+ 2*Math.PI*x);
    }
}
class Square implements Shape {
    @Override
    public void calculateArea(int x) {
        System.out.println("The area of the square with side "+x+" is "+Math.pow(x,2));
    }

    @Override
    public void calculatePerimeter(int x) {
        System.out.println("The perimeter of the square with side "+x+" is "+ 4*x);
    }
}

