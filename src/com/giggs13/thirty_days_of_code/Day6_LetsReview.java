package com.giggs13.thirty_days_of_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day6_LetsReview {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int T = scanner.nextInt();

            for (int i = 0; i < T; i++) {
                String input = scanner.next();
                List<Character> evenCharacters = new ArrayList<>();
                List<Character> oddCharacters = new ArrayList<>();

                for (int j = 0; j < input.length(); j++) {
                    if (j % 2 == 0) {
                        evenCharacters.add(input.charAt(j));
                        continue;
                    }
                    oddCharacters.add(input.charAt(j));
                }

                for (char c : evenCharacters) {
                    System.out.print(c);
                }
                System.out.print(" ");
                for (char c : oddCharacters) {
                    System.out.print(c);
                }
                if (i != T - 1) {
                    System.out.println();
                }
            }
        }
    }
}
