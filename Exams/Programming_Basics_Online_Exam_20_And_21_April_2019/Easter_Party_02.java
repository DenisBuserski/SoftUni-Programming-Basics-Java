import java.util.Scanner;

public class Easter_Party_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double envelopePriceForOne = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double discount = 0;

        if (guests >= 10 && guests <= 15) {
            discount = 0.85;
        }
        if (guests > 15 && guests <= 20) {
            discount = 0.8;
        }
        if (guests > 20) {
            discount = 0.75;
        }
        if (guests < 10) {
            discount = 1;
        }

        double result = envelopePriceForOne * discount;
        double cakePrice = budget * 0.1;
        double total = guests * result + cakePrice;
        
        if (total >= budget) {
            System.out.printf("No party! %.2f leva needed.", total - budget);
        } else {
            System.out.printf("It is party time! %.2f leva left.", budget - total);
        }

    }
}
