package com.giggs13.thirty_days_of_code;

import java.util.Scanner;

public class Day1_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        try (Scanner scan = new Scanner(System.in)) {
            int intValue = scan.nextInt();
            scan.nextLine();
            double doubleValue = scan.nextDouble();
            scan.nextLine();
            String stringValue = scan.nextLine();

            System.out.println(Integer.sum(i, intValue));
            System.out.println(Double.sum(d, doubleValue));
            System.out.println(s + stringValue);
        }
    }
}
