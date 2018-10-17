package com.giggs13.thirty_days_of_code;

import java.util.Scanner;

public class Day0_HelloWorld {
    public static void main(String[] args) {
        String inputString = null;
        try (Scanner scan = new Scanner(System.in)) {
            inputString = scan.nextLine();
        }
        System.out.println("Hello, World.\n" + inputString);
    }
}
