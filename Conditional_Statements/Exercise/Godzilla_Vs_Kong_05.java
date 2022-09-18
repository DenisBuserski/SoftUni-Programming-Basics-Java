import java.util.Scanner;

public class Godzilla_Vs_Kong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberWorkers = Integer.parseInt(scanner.nextLine());
        double priceForWorker = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double priceForClouths = numberWorkers * priceForWorker;

        if (numberWorkers > 150) {
            double priceForClouthsDiscount = priceForClouths - priceForClouths * 0.10;
            double priceForMovie = priceForClouthsDiscount + decor;
            if (priceForMovie <= budget) {
                double moneyLeft = budget - priceForMovie;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
            } else if (priceForMovie > budget) {
                double noMoney = priceForMovie - budget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", noMoney);
            }
        } else if (numberWorkers < 150) {
            double priceForMovie = priceForClouths + decor;
            if(priceForMovie <= budget){
                double moneyLeft = budget - priceForMovie;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
            } else if (priceForMovie > budget) {
                double noMoney = priceForMovie - budget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", noMoney);
            }
        }
        
    }
}
