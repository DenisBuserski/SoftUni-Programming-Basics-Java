import java.util.Scanner;

public class Car_To_Go_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classCar = "";
        String typeCar = "";
        double price = 0.0;

        if (budget <= 100) {
            classCar = "Economy class";
            if (season.equals("Summer")) {
                typeCar = "Cabrio";
                price = budget * 0.35;
            } else if (season.equals("Winter")) {
                typeCar = "Jeep";
                price = budget * 0.65;
            }
        } else if (budget > 100 && budget <= 500) {
            classCar = "Compact class";
            if (season.equals("Summer")) {
                typeCar = "Cabrio";
                price = budget * 0.45;
            } else if (season.equals("Winter")) {
                typeCar = "Jeep";
                price = budget * 0.8;
            }
        } else if (budget > 500) {
            classCar = "Luxury class";
            typeCar = "Jeep";
            price = budget * 0.9;
        }

        System.out.println(classCar);
        System.out.printf("%s - %.2f", typeCar, price);

    }
}
