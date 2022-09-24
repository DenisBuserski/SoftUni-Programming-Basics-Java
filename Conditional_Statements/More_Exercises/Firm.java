import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workersForExtraWork = Integer.parseInt(scanner.nextLine());

        double daysAfter = days - (days * 0.10);
        double hoursForWork = Math.floor(daysAfter * 8);
        double extraWork = Math.floor(workersForExtraWork * (2 * days));
        double result = Math.floor(hoursForWork + extraWork);

        if (result >= neededHours) {
            System.out.printf("Yes!%.0f hours left.", Math.floor(result - neededHours));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.floor(neededHours - result));
        }

    }
}
