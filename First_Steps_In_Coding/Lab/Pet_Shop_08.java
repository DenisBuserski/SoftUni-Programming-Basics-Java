import java.util.Scanner;

public class Pet_Shop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDogs = Integer.parseInt(scanner.nextLine());
        int numberAnimals = Integer.parseInt(scanner.nextLine());

        double priceDogs = numberDogs * 2.5;
        int priceAnimals = numberAnimals * 4;
        double price = priceDogs + priceAnimals;

        System.out.println(price);
    }
}
