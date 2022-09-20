import java.util.Scanner;

public class Toy_Shop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.next());
        int puzzles = Integer.parseInt(scanner.next());
        int dolls = Integer.parseInt(scanner.next());
        int bears = Integer.parseInt(scanner.next());
        int minions = Integer.parseInt(scanner.next());
        int trucks = Integer.parseInt(scanner.next());

        double toysPrice =  puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int toys = puzzles + dolls + bears + minions + trucks;

        if (toys >= 50) {
            double priceAfterDiscount = toysPrice - toysPrice * 0.25;
            double rent = priceAfterDiscount - priceAfterDiscount * 0.10;
            if (rent >= tripPrice) {
                double result = rent - tripPrice;
                System.out.printf("Yes! %.2f lv left.", result);
            } else if (rent < tripPrice) {
                double result = tripPrice - rent;
                System.out.printf("Not enough money! %.2f lv needed.", result);
            }
        } else if (toys < 49) {
            double rent = toysPrice - toysPrice * 0.10;
            if (rent >= tripPrice) {
                double result = rent - tripPrice;
                System.out.printf("Yes! %.2f lv left.", result);
            } else if(rent < tripPrice) {
                double result = tripPrice - rent;
                System.out.printf("Not enough money! %.2f lv needed.", result);
            }
        }
    }
}
