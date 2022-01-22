package ProgrammingBasicsOnlineExam6And7April2019;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vaucherPrice = Integer.parseInt(scanner.nextLine());
        String purchase = "";

        int tickets = 0;
        int others = 0;

        while (!purchase.equals("End")) {
            purchase = scanner.nextLine();

            if (purchase.equals("End")) {
                break;
            }

            int purchasePrice = 0;
            if (purchase.length() > 8) {
                purchasePrice = purchase.charAt(0) + purchase.charAt(1);
                if (purchasePrice <= vaucherPrice) {
                    vaucherPrice -= purchasePrice;
                    tickets++;
                }
                if (purchasePrice > vaucherPrice) {
                    break;
                }
            }
            if (purchase.length() <= 8) {
                purchasePrice = purchase.charAt(0);
                if (purchasePrice <= vaucherPrice) {
                    vaucherPrice -= purchasePrice;
                    others++;
                }
                if (purchasePrice > vaucherPrice) {
                    break;
                }
            }
        }
        System.out.printf("%d%n", tickets);
        System.out.printf("%d", others);
    }
}
