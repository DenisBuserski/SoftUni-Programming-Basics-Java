package ProgrammingBasicsOnlineExam6And7July2019;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int paintersHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.5;
        double paintPrice = (paint * 1.1) * 14.5;
        double thinnerPrice = thinner * 5;
        double finalPrice = nylonPrice + paintPrice + thinnerPrice + 0.4;
        double finalResult = (finalPrice * 0.3) * paintersHours;
        System.out.printf("Total expenses: %.2f lv.", finalResult + finalPrice);

    }
}
