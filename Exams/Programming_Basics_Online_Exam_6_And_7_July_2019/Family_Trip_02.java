import java.util.Scanner;

public class Family_Trip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        double percetAddCosts = Double.parseDouble(scanner.nextLine());

        if (nights > 7) {
            nightPrice *= 0.95;
            double priceAllNights = nights * nightPrice;
            double addCosts = (percetAddCosts / 100) * budget;
            double total = priceAllNights + addCosts;
            
            if (total <= budget) {
                System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - total);
            } else {
                System.out.printf("%.2f leva needed.", total - budget);
            }
        } else {
            double priceAllNights = nights * nightPrice;
            double addCosts = (percetAddCosts / 100) * budget;
            double total = priceAllNights + addCosts;
            
            if (total <= budget) {
                System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - total);
            } else {
                System.out.printf("%.2f leva needed.", total - budget);
            }
        }
    }
}
