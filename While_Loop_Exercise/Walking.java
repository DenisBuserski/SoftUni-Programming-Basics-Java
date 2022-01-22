package WhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int allSteps = 0;

        while (allSteps < 10000) {
            input = scanner.nextLine();

            if ("Going home".equals(input)) {
                allSteps += Integer.parseInt(scanner.nextLine());
                break;
            }
            else {
                allSteps += Integer.parseInt(input);
            }
        }

        if (allSteps >= 10000) {
            System.out.printf("Goal reached! Good job!%n" +
                    "%d steps over the goal!", allSteps - 10000);
        }
        else {
            System.out.printf("%d more steps to reach goal.", (10000 - allSteps));
        }
    }
}
