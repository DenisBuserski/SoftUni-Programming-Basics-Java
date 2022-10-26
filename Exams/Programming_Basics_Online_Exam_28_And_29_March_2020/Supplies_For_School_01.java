import java.util.Scanner;

public class Supplies_For_School_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pens = 5.8;
        double markers = 7.2;
        double soap = 1.2;     //per liter

        int pensNum = Integer.parseInt(scanner.nextLine());
        int markersNum = Integer.parseInt(scanner.nextLine());
        double soapLit = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pensPrice = pens * pensNum;
        double markersPrice = markers * markersNum;
        double soapPrice = soap * soapLit;
        double total = pensPrice + markersPrice + soapPrice;
        double result = total - ((total * discount) / 100);
        System.out.printf("%.3f", result);
    }
}
