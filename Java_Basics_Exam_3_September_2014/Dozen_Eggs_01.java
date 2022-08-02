package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Archive.Advanced_Java.Advanced_Java_Exams.Java_Basics_Exam_3_September_2014;

import java.util.Scanner;

public class Dozen_Eggs_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 7;

        // 1 dozen = 12 eggs

        int eggsSum = 0;
        int dozensSum = 0;

        while (n-- > 0) {
            String [] input = scanner.nextLine().split("\\s+");
            int number = Integer.parseInt(input[0]);
            String type = input[1];

            if (type.equals("eggs")) {
                eggsSum += number;
            } else {
                dozensSum += number;
            }


            if (eggsSum >= 12) {
                int a = eggsSum / 12;
                eggsSum %= 12;
                dozensSum += a;
            }




        }

        System.out.println(dozensSum + " dozens + " + eggsSum + " eggs");
    }
}
