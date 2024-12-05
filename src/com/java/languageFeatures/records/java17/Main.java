package com.java.languageFeatures.records.java17;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("Person Object: " + person);

        Person anotherPerson = new Person("Alice", 30);
        System.out.println("Equals? " + person.equals(anotherPerson));
    }
}
