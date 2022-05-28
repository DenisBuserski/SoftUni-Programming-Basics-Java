import java.util.Scanner;

public class Easter_Guests_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double guests = Double.parseDouble(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterBreadNum = Math.ceil(guests / 3);
        double eggsNum = guests * 2;
        double easterBreadPrice = 4 * easterBreadNum;
        double eggsPrice = 0.45 * eggsNum;
        double finalPrice = easterBreadPrice + eggsPrice;
        
        if (finalPrice <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", easterBreadNum, eggsNum);
            System.out.printf("He has %.2f lv. left.", budget - finalPrice);
        } else {
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.", finalPrice - budget);
        }

    }
}
