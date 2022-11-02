import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double kmRanOnTheFirstDay = Double.parseDouble(scanner.nextLine());
        double ranKm = 0;
        double totalKm = 0;

        for (int i = 0; i < days; i++) {
            if (ranKm == 0) {
                ranKm = kmRanOnTheFirstDay;
                totalKm += kmRanOnTheFirstDay;
            }
            double percentage = Double.parseDouble(scanner.nextLine());
            ranKm += ranKm * (percentage / 100);
            totalKm += ranKm;
        }

        if (totalKm >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", totalKm - 1000);
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", 1000 - totalKm);
        }

    }
}
