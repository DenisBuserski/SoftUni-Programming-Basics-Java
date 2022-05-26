package ProgrammingBasicsOnlineExam20And21April2019;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterbreadNum = Integer.parseInt(scanner.nextLine());
        int gradeMax = Integer.MIN_VALUE;
        String bestName = "";

        String name = "";
        for (int a = 1; a <= easterbreadNum; a++) {
            name = scanner.nextLine();
            int gradeTotal = 0;

            String input = "";
            while (!input.equals("Stop")) {
                input = scanner.nextLine();

                if (input.equals("Stop")) {
                    System.out.printf("%s has %d points.%n", name, gradeTotal);
                    if (gradeTotal > gradeMax) {
                        gradeMax = gradeTotal;
                        bestName = name;
                        System.out.printf("%s is the new number 1!%n", name);
                    }
                } else {
                    int grade = Integer.parseInt(input);
                    gradeTotal += grade;
                }
            }
        }
        System.out.printf("%s won competition with %d points!", bestName, gradeMax);


    }
}
