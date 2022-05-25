import java.util.Scanner;

public class Hotel_Room _07{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;

        switch (month) {
            case "May":
                studioPrice = 50 * nights;
                apartmentPrice = 65 * nights;
                break;
            case "October":
                studioPrice = 50 * nights;
                apartmentPrice = 65 * nights;
                break;
            case "June":
                studioPrice = 75.2 * nights;
                apartmentPrice = 68.7 * nights;
                break;
            case "September":
                studioPrice = 75.2 * nights;
                apartmentPrice = 68.7 * nights;
                break;
            case "July":
                studioPrice = 76 * nights;
                apartmentPrice = 77 * nights;
                break;
            case "August":
                studioPrice = 76 * nights;
                apartmentPrice = 77 * nights;
                break;
        }

        if (month.equals("May") || month.equals("October")) {
            if (nights > 7 && nights < 14) {
                studioPrice = studioPrice - (studioPrice * 0.05);
            } else if (nights > 14) {
                studioPrice = studioPrice - (studioPrice * 0.30);
            }
        } else if (month.equals("June") || month.equals("September")) {
            if (nights > 14) {
                studioPrice = studioPrice - (studioPrice * 0.20);
            }
        }

        if (month.equals("May") || month.equals("June") || month.equals("July") || month.equals("August") || month.equals("September") || month.equals("October")) {
            if (nights > 14) {
                apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
            }
        }

        System.out.printf("Apartment: %.2f lv.", apartmentPrice);
        System.out.println("");
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
