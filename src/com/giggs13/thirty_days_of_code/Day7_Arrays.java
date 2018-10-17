package com.giggs13.thirty_days_of_code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Day7_Arrays {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String[] array = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::valueOf)
                    .limit(n)
                    .map(String::valueOf)
                    .toArray(String[]::new);
            System.out.println(String.join(" ", invert(array)));
        }
    }

    private static String[] invert(String[] array) {
        return IntStream.rangeClosed(1, array.length)
                .map(i -> Integer.valueOf(array[array.length - i]))
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
    }
}
