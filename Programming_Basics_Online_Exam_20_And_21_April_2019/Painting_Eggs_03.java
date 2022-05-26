package ProgrammingBasicsOnlineExam20And21April2019;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggsSize = scanner.nextLine();
        String eggsColour = scanner.nextLine();
        int eggsNum = Integer.parseInt(scanner.nextLine());

        int price = 0;

        switch (eggsSize) {
            case "Large":
                if (eggsColour.equals("Red")) {
                    price = 16;
                }
                if (eggsColour.equals("Green")) {
                    price = 12;
                }
                if (eggsColour.equals("Yellow")) {
                    price = 9;
                }
                break;
            case "Medium":
                if (eggsColour.equals("Red")) {
                    price = 13;
                }
                if (eggsColour.equals("Green")) {
                    price = 9;
                }
                if (eggsColour.equals("Yellow")) {
                    price = 7;
                }
                break;
            case "Small":
                if (eggsColour.equals("Red")) {
                    price = 9;
                }
                if (eggsColour.equals("Green")) {
                    price = 8;
                }
                if (eggsColour.equals("Yellow")) {
                    price = 5;
                }
                break;
        }

        int result = eggsNum * price;
        double finalResult = result * 0.65;
        System.out.printf("%.2f leva.", finalResult);

    }
}
