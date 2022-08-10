import java.util.Scanner;

public class Flower_Shop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnoliq = Integer.parseInt(scanner.nextLine());
        int zumbul = Integer.parseInt(scanner.nextLine());
        int roza = Integer.parseInt(scanner.nextLine());
        int kaktus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double flowersPrice = magnoliq * 3.25 + zumbul * 4 + roza * 3.50 + kaktus * 8;
        double incomeAfterTax = flowersPrice - (flowersPrice * 0.05);

        if (incomeAfterTax < giftPrice) {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - incomeAfterTax));
        } else {
            System.out.printf("She is left with %.0f leva.", Math.floor(incomeAfterTax - giftPrice));
        }

    }
}
