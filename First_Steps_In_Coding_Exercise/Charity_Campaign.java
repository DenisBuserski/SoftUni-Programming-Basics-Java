import java.util.Scanner;

public class Charity_Campaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberofDays = Integer.parseInt(scanner.nextLine());
        int cakeMakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double cakePrice = cakes * 45.00;
        double cookiesPrice = cookies * 5.80;
        double pancakesPrice = pancakes * 3.20;

        double dayPriceforall = (cakePrice +cookiesPrice + pancakesPrice) * cakeMakers;
        double priceForall = dayPriceforall * numberofDays;
        double finalPrice = priceForall - (priceForall / 8);

        System.out.printf("%.2f", finalPrice);
    }
}
