package com.java.warnings.java17;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        // Incorrect usage: Synchronization: a mechanism that ensures that only one thread can access a particular block of code or resource at a time. 
        synchronized (optional) { //warning
            System.out.println("Synchronized on Optional: " + optional.get());
        }
    }
}
