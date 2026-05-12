package org.example.Functional_8_4;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int result = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        System.out.println("Sum of doubled odd numbers: " + result);
    }
}