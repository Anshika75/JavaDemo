package com.java.sealed.java17;

public sealed class Vehicle permits Car {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

