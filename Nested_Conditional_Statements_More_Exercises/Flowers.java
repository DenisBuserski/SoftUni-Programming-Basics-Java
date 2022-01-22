package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrysanthemumsPrice = 0.0;
        double rosesPrice = 0.0;
        double tulipsPrice = 0.0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumsPrice = 2;
                rosesPrice = 4.1;
                tulipsPrice = 2.5;
                break;
            case "Autumn":
            case "Winter":
                chrysanthemumsPrice = 3.75;
                rosesPrice = 4.5;
                tulipsPrice = 4.15;
                break;
        }

        double totalPrice = chrysanthemums * chrysanthemumsPrice + roses * rosesPrice + tulips * tulipsPrice;

        if (holiday.equals("Y")) {
            totalPrice = totalPrice * 1.15;
        }
        else {
            totalPrice = totalPrice * 1;
        }



        if (tulips > 7 && season.equals("Spring")) {
            totalPrice *= 0.95;
        }
        if (roses >= 10 && season.equals("Winter")) {
            totalPrice *= 0.9;
        }
        if (tulips > 20 || roses > 20 || chrysanthemums > 20 || (tulips + roses + chrysanthemums) > 20) {
            totalPrice *= 0.8;

        }

        System.out.printf("%.2f", totalPrice + 2);





    }
}
