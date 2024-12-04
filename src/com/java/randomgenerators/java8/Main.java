package com.java.randomgenerators.java8;

import java.util.Random;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        // Using java.util.Random
        Random random = new Random();
        System.out.println("Random Integer (Random): " + random.nextInt(100));
        System.out.println("Random Double (Random): " + random.nextDouble());

        // Using java.util.SplittableRandom
        SplittableRandom splittableRandom = new SplittableRandom();
        System.out.println("Random Integer (SplittableRandom): " + splittableRandom.nextInt(1, 100));
        System.out.println("Random Double (SplittableRandom): " + splittableRandom.nextDouble(0.0, 1.0));
    }
}
