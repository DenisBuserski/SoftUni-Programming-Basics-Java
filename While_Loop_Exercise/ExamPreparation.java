package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine());

        String task = scanner.nextLine();

        int badGrades = 0;
        int allGradesSum = 0;
        int gradesCount = 0;
        String currentTask = "";


        while (!task.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            allGradesSum += grade;
            gradesCount++;

            if (grade <= 4) {
                poorGradesLimit++;
                if (badGrades == poorGradesLimit) {
                    break;
                }
            }
            currentTask = task;
            task = scanner.nextLine();
        }

        double  averageScore = 1.0 * allGradesSum / gradesCount;

        String output = "";
        if (badGrades == poorGradesLimit) {
            output = String.format("You need a break, %d poor grades", badGrades);
        }
        else {
            output = String.format("Average score: %.2f%n" + "Number of problems: %d%n" + "Last problem: %s", averageScore, gradesCount, currentTask);

        }
        System.out.println(output);
    }
}
