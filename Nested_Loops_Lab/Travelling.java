package NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = "";
        double totalSum = 0;


        while (!destination.equals("End")) {
            destination = scanner.nextLine();

            if (destination.equals("End")) {
                break;
            }

            double minBudget = Double.parseDouble(scanner.nextLine());
            double money = 0;

            while (totalSum >= 0) {
                money = Double.parseDouble(scanner.nextLine());
                totalSum += money;

                if (totalSum >= minBudget) {
                    System.out.printf("Going to %s!%n", destination);
                    totalSum = 0;
                    break;
                }

            }
        }


    }
}
