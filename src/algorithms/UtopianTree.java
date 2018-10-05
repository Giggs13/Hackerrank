package algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                System.out.println(utopianTree(n));
            }
        }
    }

    static int utopianTree(int periods) {
        int treeHeight = 1;
        for (int i = 0; i < periods; i++) {
            if (i % 2 == 0) {
                treeHeight *= 2;
            } else {
                treeHeight++;
            }
        }

        return treeHeight;
    }
}
