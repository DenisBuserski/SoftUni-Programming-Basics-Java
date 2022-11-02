import java.util.Scanner;

public class Excursion_Calculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double pricePerPerson = 0.0;
        double finalPrice = 0.0;
        double discountSummer = 0.15;
        double increasewinter = 1.08;

        switch (season) {
            case "spring":
                if (people > 5) {
                    pricePerPerson = 48;
                    finalPrice = pricePerPerson * people;
                } else {
                    pricePerPerson = 50;
                    finalPrice = pricePerPerson * people;
                }
                break;
            case "summer":
                if (people > 5) {
                    pricePerPerson = 45;
                    finalPrice = (pricePerPerson * people) * 0.85;
                } else {
                    pricePerPerson = 48.5;
                    finalPrice = (pricePerPerson * people) * 0.85;
                }
                break;
            case "autumn":
                if (people > 5) {
                    pricePerPerson = 49.5;
                    finalPrice = pricePerPerson * people;
                } else {
                    pricePerPerson = 60;
                    finalPrice = pricePerPerson * people;
                }
                break;
            case "winter":
                if (people > 5) {
                    pricePerPerson = 85;
                    finalPrice = (pricePerPerson * people) * 1.08;
                } else {
                    pricePerPerson = 86;
                    finalPrice = (pricePerPerson * people) * 1.08;
                }
                break;
        }

        System.out.printf("%.2f leva.", finalPrice);
    }
}
