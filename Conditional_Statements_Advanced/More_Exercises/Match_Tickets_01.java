import java.util.Scanner;

public class Match_Tickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int fans = Integer.parseInt(scanner.nextLine());

        double moneyLeft = 0.0;

        if (fans >= 1 && fans <= 4) {
            moneyLeft = budget - (budget * 0.75);
        } else if (fans <= 9 ) {
            moneyLeft = budget - (budget * 0.60);
        } else if (fans <= 24) {
            moneyLeft = budget - (budget * 0.50);
        } else if (fans <=49) {
            moneyLeft = budget - (budget * 0.40);
        } else {
            moneyLeft = budget - (budget * 0.25);
        }

        double ticketPrice = 0.0;
        double totalPrice = 0.0;

        if (category.equals("Normal")) {
            ticketPrice = 249.99;
            totalPrice = ticketPrice * fans;
        } else if (category.equals("VIP")) {
            ticketPrice = 499.99;
            totalPrice = ticketPrice * fans;
        }

        if (totalPrice > moneyLeft) {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - moneyLeft);
        } else if (totalPrice < moneyLeft) {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft - totalPrice);
        }

    }
}
