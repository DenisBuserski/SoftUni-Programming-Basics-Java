import java.util.Scanner;

public class Report_System_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumSales = Integer.parseInt(scanner.nextLine());

        int sumResult = 0;
        int row = 0;
        double cash = 0;
        double card = 0;
        double res1 = 0;
        double res2 = 0;
        int cashP = 0;
        int cardP = 0;

        String input = "";
        while (sumResult < sumSales) {
            input = scanner.nextLine();
            row++;

            if (input.equals("End")) {
                break;
            }
            // CASH
            if (row % 2 != 0) {
                if (Integer.parseInt(input) > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    cash += Integer.parseInt(input);
                    cashP++;
                    res1 = cash / cashP;
                    sumResult += Integer.parseInt(input);
                    System.out.println("Product sold!");
                    if (sumResult >= sumSales) {
                        System.out.printf("Average CS: %.2f%n", res1);
                        System.out.printf("Average CC: %.2f", res2);
                    }
                }
            }
            // CARD
            if (row % 2 == 0) {
                if (Integer.parseInt(input) < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    card += Integer.parseInt(input);
                    cardP++;
                    res2 = card / cardP;
                    sumResult += Integer.parseInt(input);
                    System.out.println("Product sold!");
                    if (sumResult >= sumSales) {
                        System.out.printf("Average CS: %.2f%n", res1);
                        System.out.printf("Average CC: %.2f", res2);
                    }
                }
            }
        }

        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
