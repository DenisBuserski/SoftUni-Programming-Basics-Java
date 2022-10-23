import java.util.Scanner;

public class Easter_Bake_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadNum = Integer.parseInt(scanner.nextLine());

        double totalSugar = 0;
        double totalFlour = 0;

        double maxSugar = Integer.MIN_VALUE;
        double maxFlour = Integer.MIN_VALUE;

        for (int a = 1; a <= easterBreadNum; a++) {
            double sugar = Double.parseDouble(scanner.nextLine());
            double flour = Double.parseDouble(scanner.nextLine());

            totalSugar += sugar;
            totalFlour += flour;

            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }
        
        double packSugar = Math.ceil(totalSugar / 950);
        double packFlour = Math.ceil(totalFlour / 750);

        System.out.printf("Sugar: %.0f%n", packSugar);
        System.out.printf("Flour: %.0f%n", packFlour);
        System.out.printf("Max used flour is %.0f grams, max used sugar is %.0f grams.", maxFlour, maxSugar);
    }
}
