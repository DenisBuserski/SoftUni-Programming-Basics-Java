import java.util.Scanner;

public class Godzilla_Vs_Kong_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());
        double clothsPriceForOneWorker = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double clothsPriceTotal = workers * clothsPriceForOneWorker;
        double clothsPriceTotalNew = 0;
        
        if (workers > 150) {
            clothsPriceTotalNew = clothsPriceTotal - (clothsPriceTotal * 0.1);
        } else {
            clothsPriceTotalNew = clothsPriceTotal;
        }

        double totalSum = decor + clothsPriceTotalNew;

        if (totalSum <= budget) {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSum);
        } else {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", totalSum - budget);
        }

    }
}
