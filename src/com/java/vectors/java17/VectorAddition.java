package com.java.vectors.java17;

import jdk.incubator.vector.*;

public class VectorAddition {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {9, 10, 11, 12, 13, 14, 15, 16};
        int[] result = new int[8];

        // Create vectors for array1 and array2
        VectorSpecies<Integer> SPECIES = IntVector.SPECIES_256;
        IntVector v1 = IntVector.fromArray(SPECIES, array1, 0);
        IntVector v2 = IntVector.fromArray(SPECIES, array2, 0);

        // Perform vectorized addition
        IntVector v3 = v1.add(v2);

        // Store the result back to the array
        v3.intoArray(result, 0);

        // Print the result
        for (int i : result) {
            System.out.println(i);
        }
    }
}


// javac --module-path ./src --add-modules jdk.incubator.vector -d out ./src/com/java/vectors/java17/VectorAddition.java
// java --module-path ./src --class-path out --add-modules jdk.incubator.vector com.java.vectors.java17.VectorAddition