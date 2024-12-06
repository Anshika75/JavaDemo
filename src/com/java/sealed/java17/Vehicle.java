package com.java.sealed.java17;

public sealed class Vehicle permits Truck {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

