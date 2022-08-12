import java.util.Scanner;

public class School_Camp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (season) {
            case "Spring":
                if (group.equals("boys") || group.equals("girls")) {
                    price = students * nights * 7.2;
                } else if (group.equals("mixed")) {
                    price = students * nights * 9.5;
                }
                break;
            case "Summer":
                if (group.equals("boys") || group.equals("girls")) {
                    price = students * nights * 15;
                } else if (group.equals("mixed")) {
                    price = students * nights * 20;
                }
                break;
            case "Winter":
                if (group.equals("boys") || group.equals("girls")) {
                    price = students * nights * 9.6;
                } else if (group.equals("mixed")) {
                    price = students * nights * 10;
                }
                break;
        }

        String sport = "";
        switch (season) {
            case "Spring":
                if (group.equals("boys")) {
                    sport = "Tennis";
                } else if (group.equals("girls")) {
                    sport = "Athletics";
                } else if (group.equals("mixed")) {
                    sport = "Cycling";
                }
                break;
            case "Summer":
                if (group.equals("boys")) {
                    sport = "Football";
                } else if (group.equals("girls")) {
                    sport = "Volleyball";
                } else if (group.equals("mixed")) {
                    sport = "Swimming";
                }
                break;
            case "Winter":
                if (group.equals("boys")) {
                    sport = "Judo";
                } else if (group.equals("girls")) {
                    sport = "Gymnastics";
                } else if (group.equals("mixed")) {
                    sport = "Ski";
                }
                break;
        }

        double result = 0.0;
        if (students >= 50) {
            result = price - (price * 0.5);
        } else if (students >= 20) {
            result = price - (price * 0.15);
        } else if (students >= 10) {
            result = price - (price * 0.05);
        } else if (students < 10){
            result = price;
        }

        System.out.printf("%s %.2f lv.", sport, result);
    }
}
