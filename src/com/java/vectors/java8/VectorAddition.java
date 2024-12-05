package com.java.vectors.java8;

public class VectorAddition {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] result = new int[5];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }

        // Print the result
        for (int i : result) {
            System.out.println(i);
        }
    }
}

