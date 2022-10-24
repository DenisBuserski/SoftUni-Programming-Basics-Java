import java.util.Scanner;

public class Easter_Decoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        double finalPrice = 0;

        for (int a = 1; a <= clients; a++) {
            String purchase = "";
            int purchaseNum = 0;
            double basketPrice = 0;
            double wreathPrice = 0;
            double chocolateBunnyPrice = 0;

            while (!purchase.equals("Finish")) {
                purchase = scanner.nextLine();

                if (purchase.equals("Finish")) {
                    if (purchaseNum % 2 == 0) {
                        totalPrice = (basketPrice + wreathPrice + chocolateBunnyPrice) * 0.8;
                        finalPrice += totalPrice;
                        System.out.printf("You purchased %d items for %.2f leva.%n", purchaseNum, totalPrice);
                        break;
                    } else {
                        totalPrice = basketPrice + wreathPrice + chocolateBunnyPrice;
                        finalPrice += totalPrice;
                        System.out.printf("You purchased %d items for %.2f leva.%n", purchaseNum, totalPrice);
                        break;
                    }
                } else {
                    purchaseNum++;
                    if (purchase.equals("basket")) {
                        basketPrice += 1.5;
                    }
                    if (purchase.equals("wreath")) {
                        wreathPrice += 3.8;
                    }
                    if (purchase.equals("chocolate bunny")) {
                        chocolateBunnyPrice += 7;
                    }
                }

            }
        }

        System.out.printf("Average bill per client is: %.2f leva.", finalPrice / clients);
    }
}
