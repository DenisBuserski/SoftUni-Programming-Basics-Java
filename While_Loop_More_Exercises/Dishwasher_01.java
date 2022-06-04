import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soapBottles = Integer.parseInt(scanner.nextLine());
        int soap = soapBottles * 750;

        String input = "";
        int row = 0;
        int pot = 0;
        int plate = 0;
        int potSoap = 0;
        int plateSoap = 0;

        while(!input.equals("End")) {
            input = scanner.nextLine();
            row++;

            if (input.equals("End")) {
                break;
            } else if (row % 3 == 0) {
                pot = 15 * Integer.parseInt(input);
                soap -= pot;
                potSoap += pot;
                if (soap < 0) {
                    break;
                }
            } else if (row % 3 != 0) {
                plate = 5 * Integer.parseInt(input);
                soap -= plate;
                plateSoap += plate;
                if (soap < 0) {
                    break;
                }
            }
        }
        
        if (soap >= 0) {
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.", plateSoap / 5, potSoap / 15, soap);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(soap));
        }

    }
}
