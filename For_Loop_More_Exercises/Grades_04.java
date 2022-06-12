import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double students = Double.parseDouble(scanner.nextLine());
        double topStudents = 0;
        double veryGood = 0;
        double good = 0;
        double fail = 0;
        double avarage = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5.00) {
                topStudents++;
            } else if (grade >= 4.00) {
                veryGood++;
            } else if (grade >= 3.00) {
                good++;
            } else {
                fail++;
            }

            avarage += grade;
        }

        System.out.printf("Top students: %.2f%%%n", (topStudents / students) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (veryGood / students) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (good / students) * 100);
        System.out.printf("Fail: %.2f%%%n", (fail / students) * 100);
        System.out.printf("Average: %.2f", avarage / students);
    }
}
