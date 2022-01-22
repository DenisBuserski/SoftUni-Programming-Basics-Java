package SimpleOperationsAndCalculationsMoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        double cenaKgVegetables = Double.parseDouble(scanner.nextLine());
        double cenaKgFruits = Double.parseDouble(scanner.nextLine());
        double allKgVegetables = Double.parseDouble(scanner.nextLine());
        double allKgFruits = Double.parseDouble(scanner.nextLine());

        double pricevegetables = cenaKgVegetables * allKgVegetables;
        double pricefruits = cenaKgFruits * allKgFruits;

        double result = pricefruits + pricevegetables;
        double finalresult = result / 1.94;

        System.out.printf("%.2f", finalresult);
    }
}
