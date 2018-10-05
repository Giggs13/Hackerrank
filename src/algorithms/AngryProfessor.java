package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < t; i++) {
                int[] allAndExpectedStudentCounts = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(el -> Integer.parseInt(el)).toArray();
                int[] studentArrivingTimes = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(el -> Integer.parseInt(el)).toArray();

                System.out.println(angryProfessor(allAndExpectedStudentCounts, studentArrivingTimes));
            }
        }
    }

    static String angryProfessor(int[] allAndExpectedStudentCounts, int[] studentArrivingTimes) {
        int studentsInAttendanceOnTime = 0;
        for (int i = 0; i < allAndExpectedStudentCounts[0]; i++) {
            if (studentArrivingTimes[i] <= 0) {
                studentsInAttendanceOnTime++;
            }
        }
        if (studentsInAttendanceOnTime < allAndExpectedStudentCounts[1]) {
            return "YES";
        }
        return "NO";
    }
}
