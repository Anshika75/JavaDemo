package com.java.languageFeatures.typeInference.java17;

public class Main {
    public static void main(String[] args) {
        var message = "Hello, Java 10!"; // Compiler infers this as String
        var number = 42;                // Compiler infers this as int

        System.out.println(message);
        System.out.println(number);
    }
}
