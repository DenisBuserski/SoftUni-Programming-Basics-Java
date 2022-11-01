import java.util.Scanner;

public class Deer_Of_Santa_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double food1 = Double.parseDouble(scanner.nextLine());
        double food2 = Double.parseDouble(scanner.nextLine());
        double food3 = Double.parseDouble(scanner.nextLine());

        double deer1 = days * food1;
        double deer2 = days * food2;
        double deer3 = days * food3;
        double totalFood = deer1 + deer2 + deer3;

        if (totalFood < foodKg) {
            double result = foodKg - totalFood;
            System.out.printf("%.0f kilos of food left.", Math.floor(result));
        } else {
            double result1 = totalFood - foodKg;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(result1));
        }
    }
}
