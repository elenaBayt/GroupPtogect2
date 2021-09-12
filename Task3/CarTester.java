package com.company.groupProject.Task3;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Truck(2500,45000);
        car.calculateSalePrice();

        Car car1 = new Truck(1990,23000);
        car1.calculateSalePrice();

        Car car2 = new Sedan(23,20000);
        car2.calculateSalePrice();

        Car car3 = new Sedan(19,18000);
        car3.calculateSalePrice();
    }

}
