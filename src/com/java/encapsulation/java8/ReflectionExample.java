package com.java.encapsulation.java8;

import sun.misc.Unsafe;

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