import java.util.Scanner;

public class Deer_Of_Santa_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysMissing = Integer.parseInt(scanner.nextLine());
        int leftFoodKg = Integer.parseInt(scanner.nextLine());
        double foodFirst = Double.parseDouble(scanner.nextLine());
        double foodSecond = Double.parseDouble(scanner.nextLine());
        double foodThird = Double.parseDouble(scanner.nextLine());

        double foodEatenFirst = daysMissing * foodFirst;
        double foodEatenSecond = daysMissing * foodSecond;
        double foodEatenThird = daysMissing * foodThird;
        double totalFoodEaten = foodEatenFirst + foodEatenSecond + foodEatenThird;

        if (totalFoodEaten <= leftFoodKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(leftFoodKg - totalFoodEaten));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodEaten - leftFoodKg));
        }
        
    }
}
