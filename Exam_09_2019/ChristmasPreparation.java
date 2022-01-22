package Exam092020;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paper = Integer.parseInt(scanner.nextLine());
        int cloth = Integer.parseInt(scanner.nextLine());
        double glue = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pricePaper = paper * 5.8;
        double priceCloth = cloth * 7.2;
        double priceGlue = glue * 1.2;
        double totalPrice = pricePaper + priceCloth + priceGlue;
        double discountPercentege = discount / 100;
        double result = totalPrice - (totalPrice * discountPercentege);


        System.out.printf("%.3f", result);
    }
}
