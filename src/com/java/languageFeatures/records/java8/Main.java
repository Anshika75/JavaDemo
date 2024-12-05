package com.java.languageFeatures.records.java8;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Person Object: " + person);

        Person anotherPerson = new Person("Alice", 30);
        System.out.println("Equals? " + person.equals(anotherPerson));
    }
}

