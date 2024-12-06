package com.java.encapsulation.java8;

import sun.misc.Unsafe;

// used for accessing the internal Unsafe class.
// Unsafe class is a class that provides low-level methods for memory management, synchronization, and other low-level operations. 
// It is used internally by the Java core libraries and other libraries that require low-level operations. 
// Unsafe class is not part of the Java SE specification, and it is not guaranteed to be available in all Java implementations. 
// It is not recommended to use the Unsafe class in your code because it can lead to security vulnerabilities and other issues. 
// It is not intended to be used by application developers. 

import java.lang.reflect.Field;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Accessing the internal Unsafe class
            Field theUnsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) theUnsafeField.get(null);

            System.out.println("Unsafe instance: " + unsafe);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// javac com/java/encapsulation/java8/ReflectionExample.java
// java --add-opens java.base/sun.misc=ALL-UNNAMED com.java.encapsulation.java8.ReflectionExample