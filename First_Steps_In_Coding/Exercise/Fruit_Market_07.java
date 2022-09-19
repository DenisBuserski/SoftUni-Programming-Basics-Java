import java.util.Scanner;

public class Fruit_Market_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceStrawberryKg = Double.parseDouble(scanner.nextLine());
        double bananaKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double maliniKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());

        double priceMaliniKg = priceStrawberryKg * 0.5;
        double priceOrangeKg = priceMaliniKg - (0.4 * priceMaliniKg);
        double priceBananaKg = priceMaliniKg - (0.8 * priceMaliniKg);

        double priceMalini = maliniKg * priceMaliniKg;
        double priceOrange = orangeKg * priceOrangeKg;
        double pricebanana = bananaKg * priceBananaKg;
        double priceStrawberry = strawberryKg * priceStrawberryKg;

        double finalPrice = priceMalini + priceOrange + pricebanana + priceStrawberry;

        System.out.printf("%.2f", finalPrice);
    }
}
