package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (km <= 5000) {
                    price = km * 0.75;
                }
                else if (km > 5000 && km <= 10000) {
                    price = km * 0.95;
                }
                else if (km > 10000 && km <= 20000) {
                    price = km * 1.45;
                }
                break;
            case "Summer":
                if (km <= 5000) {
                    price = km * 0.9;
                }
                else if (km > 5000 && km <= 10000) {
                    price = km * 1.1;
                }
                else if (km > 10000 && km <= 20000) {
                    price = km * 1.45;
                }
                break;
            case "Winter":
                if (km <= 5000) {
                    price = km * 1.05;
                }
                else if (km > 5000 && km <= 10000) {
                    price = km * 1.25;
                }
                else if (km > 10000 && km <= 20000) {
                    price = km * 1.45;
                }
                break;
        }

        double salary = price * 4;
        double result = salary - (salary * 0.1);
        System.out.printf("%.2f", result);
    }
}
