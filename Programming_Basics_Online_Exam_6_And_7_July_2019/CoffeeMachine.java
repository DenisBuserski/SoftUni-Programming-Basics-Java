package ProgrammingBasicsOnlineExam6And7July2019;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinksNum = Integer.parseInt(scanner.nextLine());
        double drinkPrice = 0;

        switch (drink) {
            case "Espresso":
                switch (sugar) {
                    case "Without":
                        drinkPrice = drinksNum * 0.9;
                        break;
                    case "Normal":
                        drinkPrice = drinksNum * 1;
                        break;
                    case "Extra":
                        drinkPrice = drinksNum * 1.2;
                        break;
                }
                break;
            case "Cappuccino":
                switch (sugar) {
                    case "Without":
                        drinkPrice = drinksNum * 1;
                        break;
                    case "Normal":
                        drinkPrice = drinksNum * 1.2;
                        break;
                    case "Extra":
                        drinkPrice = drinksNum * 1.6;
                        break;
                }
                break;
            case "Tea":
                switch (sugar) {
                    case "Without":
                        drinkPrice = drinksNum * 0.5;
                        break;
                    case "Normal":
                        drinkPrice = drinksNum * 0.6;
                        break;
                    case "Extra":
                        drinkPrice = drinksNum * 0.7;
                        break;
                }
                break;
        }
        if (sugar.equals("Without")) {
            drinkPrice *= 0.65;
        }
        if (drink.equals("Espresso") && drinksNum >= 5) {
            drinkPrice *= 0.75;
        }
        if (drinkPrice > 15) {
            drinkPrice *= 0.8;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", drinksNum, drink, drinkPrice);

    }
}
