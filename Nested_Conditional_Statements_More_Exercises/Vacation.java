package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String location = "";
        double price = 0.0;

        if (budget <= 1000) {
            place = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.65;
            }
            else if (season.equals("Winter")) {
                location = "Morocco";
                price = budget * 0.45;
            }
        }
        else if (budget > 1000 && budget <= 3000) {
            place = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.8;
            }
            else if (season.equals("Winter")) {
                location = "Morocco";
                price = budget * 0.6;
            }
        }
        else if (budget > 3000) {
            place = "Hotel";
            price = budget * 0.9;
            if (season.equals("Summer")) {
                location = "Alaska";
            }
            else if (season.equals("Winter")) {
                location = "Morocco";
            }
        }

        System.out.printf("%s - %s - %.2f", location, place, price);
    }
}
