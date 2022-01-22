package ProgrammingBasicsOnlineExam28And29March2020;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sec = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secPerM = Double.parseDouble(scanner.nextLine());

        double res1 = meters * secPerM;
        double res2 = Math.floor(meters / 50) * 30;
        double totalTime = res1 + res2;

        if (sec <= totalTime) {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - sec);
        }
        else {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }


    }
}
