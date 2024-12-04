package com.java.sealed.java8;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move();
        Vehicle truck = new Truck();
        truck.move();
    }

}
