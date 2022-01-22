package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());

        double dog = dogFood * days;
        double cat = catFood * days;
        double turtle = (turtleFood / 1000) * days;
        double totalFood = dog + cat + turtle;

        if (totalFood <= foodKg){
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKg - totalFood));
        }
        else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood - foodKg));
        }
    }
}
