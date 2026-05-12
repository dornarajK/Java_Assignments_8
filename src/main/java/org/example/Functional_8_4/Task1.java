package org.example.Functional_8_4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        double mean = Arrays.stream(numbers)
                .average()
                .orElse(0);

        System.out.println("Mean of array: " + mean);
    }
}