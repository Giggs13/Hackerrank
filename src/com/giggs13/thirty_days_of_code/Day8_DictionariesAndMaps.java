package com.giggs13.thirty_days_of_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_DictionariesAndMaps {
    public static void main(String[] args) {
        Map<String, Integer> dictionary = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                scanner.nextLine();
                String name = scanner.next();
                int phone = scanner.nextInt();
                dictionary.put(name, phone);
            }
            while (scanner.hasNext()) {
                String searchTerm = scanner.next();
                if (dictionary.containsKey(searchTerm)) {
                    System.out.println(searchTerm + "=" + dictionary.get(searchTerm));
                } else {
                    System.out.println("Not found");
                }
            }
        }
    }
}
