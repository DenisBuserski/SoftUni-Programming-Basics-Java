package ProgrammingBasicsOnlineExam6And7July2019;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNum = Integer.parseInt(scanner.nextLine());
        double entryTax = Double.parseDouble(scanner.nextLine());
        double deckChairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double allTax = peopleNum * entryTax;
        double res1 = Math.ceil(peopleNum * 0.75) * deckChairPrice;
        double res2 = Math.ceil(peopleNum * 0.5) * umbrellaPrice;
        double finalResult = allTax + res1 + res2;

        System.out.printf("%.2f lv.", finalResult);

    }
}
