import java.util.Scanner;

public class Clever_Lily_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double priceWM = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        double money = 10;
        double sum = 0;

        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                sum += money;
                sum -= 1;
                money += 10;
            } else {
                toysCount++;
            }
        }
        
        sum += toyPrice * toysCount;

        if (priceWM <= sum) {
            System.out.printf("Yes! %.2f", sum - priceWM);
        } else {
            System.out.printf("No! %.2f", priceWM - sum);
        }
        
    }
}
