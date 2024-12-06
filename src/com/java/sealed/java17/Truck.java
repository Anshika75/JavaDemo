package com.java.sealed.java17;

public sealed class Truck extends Vehicle permits Car {
    public void move() {
        System.out.println("Truck is moving");
    }
}