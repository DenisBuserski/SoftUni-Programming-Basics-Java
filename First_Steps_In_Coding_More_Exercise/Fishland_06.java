import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSkumriqKg = Double.parseDouble(scanner.nextLine());
        double priceCacaKg = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi = Double.parseDouble(scanner.nextLine());

        double priceMidiKg = 7.50;

        double pricePalmudKg = priceSkumriqKg + priceSkumriqKg * 0.60;
        double pricePalamud = kgPalamud * pricePalmudKg;
        double priceSafridKg = priceCacaKg + priceCacaKg * 0.80;
        double priceSafrid = priceSafridKg * kgSafrid;
        double priceMidi = priceMidiKg * kgMidi;

        double result = pricePalamud + priceSafrid + priceMidi;

        System.out.printf("%.2f", result);
    }
}
