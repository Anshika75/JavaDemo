package com.java.warnings.java17;

import java.util.Optional;

//Optional is a value based class that is used to represent an optional value means it can be null or non-null.
// A value-based class is a class that is defined by its value, that is, the class has no identity and is immutable.

public class Main {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(2);

        if(optional.equals(3)){
            
            System.out.println("Synchronized on Optional: " + optional.get());
        }
         //warning
    }
}
