import java.util.Scanner;

public class Easter_Lunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadNum = Integer.parseInt(scanner.nextLine());
        int eggsNum = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());

        double easterBreadPrice = easterBreadNum * 3.2;
        double eggsPrice = eggsNum * 4.35;
        double cookiesPrice = cookiesKg * 5.4;
        double paintEggsPrice = eggsNum * 12 * 0.15;

        double result = easterBreadPrice + eggsPrice + cookiesPrice + paintEggsPrice;
        System.out.printf("%.2f", result);
    }
}
