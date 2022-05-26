package ProgrammingBasicsOnlineExam20And21April2019;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsNum = Integer.parseInt(scanner.nextLine());

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        String colour = "";

        for (int a = 1; a <= eggsNum; a++) {
            colour = scanner.nextLine();

            switch (colour) {
                case "red":
                    red++;
                    break;
                case "orange":
                    orange++;
                    break;
                case "blue":
                    blue++;
                    break;
                case "green":
                    green++;
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);

        int max = Math.max(Math.max(red, orange), Math.max(blue, green));
        String colourResult = "";
        if (max == red) {
            colourResult = "red";
        }
        if (max == orange) {
            colourResult = "orange";
        }
        if (max == blue) {
            colourResult = "blue";
        }
        if (max == green) {
            colourResult = "green";
        }
        System.out.printf("Max eggs: %d -> %s", max, colourResult);
    }
}
