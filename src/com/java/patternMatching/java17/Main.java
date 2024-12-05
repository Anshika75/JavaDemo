package com.java.patternMatching.java17;


public class Main {
    public static void main(String[] args) {
        Object obj = "Java Demo";

        // Pattern matching with instanceof
        if (obj instanceof String str) {
            System.out.println("String length: " + str.length());
        }

        // Pattern matching with switch
        switch (obj) {
            case String str -> System.out.println("String value: " + str);
            case Integer num -> System.out.println("Integer value: " + num);
            default -> System.out.println("Unknown type");
        }
    }
}
