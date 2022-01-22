package ForLoopMoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double rezult = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;

        for (int i = 1; i <= n; i++) {
            double value = Double.parseDouble(scanner.nextLine());

            if (value >= 0 && value <= 50) {
                if (value < 10) {
                    value *= 0.2;
                    n1++;
                } else if (value < 20) {
                    value *= 0.3;
                    n2++;
                } else if (value < 30) {
                    value *= 0.4;
                    n3++;
                } else if (value < 40) {
                    value = 50.0;
                    n4++;
                } else {
                    value = 100.0;
                    n5++;
                }
                rezult += value;
            } else {
                rezult /= 2;
                n6++;
            }
        }
        System.out.printf("%.2f%n", rezult);
        System.out.printf("From 0 to 9: %.2f%%%n", (n1 * 1.0 / n * 100));
        System.out.printf("From 10 to 19: %.2f%%%n", (n2 * 1.0 / n * 100));
        System.out.printf("From 20 to 29: %.2f%%%n", (n3 * 1.0 / n * 100));
        System.out.printf("From 30 to 39: %.2f%%%n", (n4 * 1.0 / n * 100));
        System.out.printf("From 40 to 50: %.2f%%%n", (n5 * 1.0 / n * 100));
        System.out.printf("Invalid numbers: %.2f%%", (n6 * 1.0 / n * 100));
    }
}