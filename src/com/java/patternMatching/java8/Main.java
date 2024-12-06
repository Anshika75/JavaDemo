package com.java.patternMatching.java8;

public class Main { 
    public static void main(String[] args) {
        Object obj = "Java Demo";

        // Instanceof with manual casting
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("String length: " + str.length());
        }

        // Switch with manual type checking
        switch (obj.getClass().getSimpleName()) {
            case "String":
                String str = (String) obj;
                System.out.println("String value: " + str);
                break;
            case "Integer":
                Integer num = (Integer) obj;
                System.out.println("Integer value: " + num);
                break;
            default:
                System.out.println("Unknown type");
        }
    }
}

