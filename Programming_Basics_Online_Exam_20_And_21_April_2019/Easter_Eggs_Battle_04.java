package ProgrammingBasicsOnlineExam20And21April2019;

import java.util.Scanner;

public class Easter_Eggs_Battle_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsFirtst = Integer.parseInt(scanner.nextLine());
        int eggsSecond = Integer.parseInt(scanner.nextLine());

        String comand = "";
        while (!comand.equals("End of battle")) {
            comand = scanner.nextLine();

            if (comand.equals("one")) {
                eggsSecond--;
            }
            if (comand.equals("two")) {
                eggsFirtst--;
            }

            if (comand.equals("End of battle")) {
                System.out.printf("Player one has %d eggs left.%n", eggsFirtst);
                System.out.printf("Player two has %d eggs left.", eggsSecond);
                break;
            }
            if (eggsFirtst <= 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSecond);
                break;
            }
            if (eggsSecond <= 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsFirtst);
                break;
            }
        }

    }
}
