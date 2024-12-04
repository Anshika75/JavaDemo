package com.java.randomgenerators.java17;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        // Using java.util.Random through RandomGenerator
        RandomGenerator randomGenerator1 = RandomGenerator.of("Random");
        System.out.println("Random Integer (Random): " + randomGenerator1.nextInt(100));
        System.out.println("Random Double (Random): " + randomGenerator1.nextDouble());

        // Using SplittableRandom through RandomGenerator
        RandomGenerator randomGenerator2 = RandomGenerator.of("SplittableRandom");
        System.out.println("Random Integer (SplittableRandom): " + randomGenerator2.nextInt(1, 100));
        System.out.println("Random Double (SplittableRandom): " + randomGenerator2.nextDouble());
    }
}

