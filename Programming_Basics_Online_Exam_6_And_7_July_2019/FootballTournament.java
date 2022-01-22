package ProgrammingBasicsOnlineExam6And7July2019;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int playedGames = Integer.parseInt(scanner.nextLine());

        double wonGames = 0;
        int drawnGames = 0;
        int lostGames = 0;

        int wPoints = 0;
        int dPoints = 0;

        for (int a = 1; a <= playedGames; a++) {
            String result = scanner.nextLine();

            if (result.equals("W")) {
                wonGames++;
                wPoints += 3;
            }
            if (result.equals("D")) {
                drawnGames++;
                dPoints++;
            }
            if (result.equals("L")) {
                lostGames++;
            }
        }
        if (playedGames > 0) {
            double winRate = (wonGames / playedGames) * 100;

            System.out.printf("%s has won %d points during this season.%n", teamName, wPoints + dPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %.0f%n", wonGames);
            System.out.printf("## D: %d%n", drawnGames);
            System.out.printf("## L: %d%n", lostGames);
            System.out.printf("Win rate: %.2f%%", winRate);
        }
        else {
            System.out.printf("%s hasn't played any games during this season.", teamName);
        }



    }
}
