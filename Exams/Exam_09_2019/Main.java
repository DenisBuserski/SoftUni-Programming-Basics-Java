import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mens = 15;
        int ladies = 20;
        int kids = 10;
        int touchUp = 20;
        int fullColor = 30;

        int salesTarget = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int sales = 0;

        while (!command.equals("closed")) {
            switch (command) {
                case "mens":
                    sales += mens;
                    break;
                case "ladies":
                    sales += ladies;
                    break;
                case "kids":
                    sales += kids;
                    break;
                case "touch up":
                    sales += touchUp;
                    break;
                case "full color":
                    sales += fullColor;
                    break;
            }

            if (sales >= salesTarget) {
                System.out.println("You have reached your target for the day!");
                break;
            }

            command = scanner.nextLine();
        }

        if (sales < salesTarget) {
            System.out.printf("Target not reached! You need %d lv. more&%n", salesTarget - sales);
        }

        System.out.printf("Earned money: %dlv.", sales);
    }
}
