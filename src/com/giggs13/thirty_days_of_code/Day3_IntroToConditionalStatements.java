package com.giggs13.thirty_days_of_code;

import java.util.Scanner;

public class Day3_IntroToConditionalStatements {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int inputNumber = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if (inputNumber < 1 && inputNumber > 100) {
                throw new IllegalArgumentException("Bad input number");
            }

            if (inputNumber % 2 == 1) {
                System.out.println("Weird");
            } else if (inputNumber >= 2 && inputNumber <= 5) {
                System.out.println("Not Weird");
            } else if (inputNumber >= 6 && inputNumber <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}
