package ProgrammingBasicsOnlineExam6And7April2019;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int films = Integer.parseInt(scanner.nextLine());

        double totalRate = 0;
        double minRate = Double.MAX_VALUE;
        double maxRate = Double.MIN_VALUE;
        String filmName = "";

        String filmMAX = "";
        String filmMIN = "";

        for (int a = 1; a <= films; a++) {
            filmName = scanner.nextLine();
            double filmRate = Double.parseDouble(scanner.nextLine());

            if (filmRate > maxRate) {
                maxRate = filmRate;
                filmMAX = filmName;
            }
            if (filmRate < minRate) {
                minRate = filmRate;
                filmMIN = filmName;
            }

            totalRate += filmRate;
        }
        double avarageRate = totalRate / films;

        System.out.printf("%s is with highest rating: %.1f%n", filmMAX, maxRate);
        System.out.printf("%s is with lowest rating: %.1f%n", filmMIN, minRate);
        System.out.printf("Average rating: %.1f", avarageRate);


    }
}
