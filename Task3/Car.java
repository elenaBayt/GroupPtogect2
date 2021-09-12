package com.company.groupProject.Task3;

public abstract class Car {
    int carPrice;
    String color;
    abstract void calculateSalePrice();
}
class Truck extends Car {
    int weight;

    Truck(int weight,int carPrice) {
        this.weight=weight;
        this.carPrice = carPrice;
    }

    @Override
    void calculateSalePrice() {
        double discount;
        if(weight>2000) {
            discount = 0.1;
        } else {
            discount = 0.2;
        }
        System.out.println("The truck price is "+carPrice+", the weight of truck is "+ weight +
                ", base on truck weight discount is "+discount*100+"%, the sale price will be "+(carPrice-(carPrice*discount)));
    }
}
class Sedan extends Car {
    int length;

    Sedan(int length,int carPrice) {
        this.length=length;
        this.carPrice = carPrice;
    }

    @Override
    void calculateSalePrice() {
        double discount;
        if(length>20) {
            discount = 0.05;
        } else {
            discount = 0.1;
        }
        System.out.println("The sedan price is "+carPrice+", the length of sedan is "+ length +
                ", base on sedan length discount is "+discount*100+"%, the sale price will be "+(carPrice-(carPrice*discount)));

    }

}
