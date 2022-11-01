import java.util.Scanner;

public class Weather_Forecast_Part_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());

        if (a <= 5.00) {
            System.out.println("unknown");
        } else if (a <= 11.9) {
            System.out.println("Cold");
        } else if (a <= 14.9) {
            System.out.println("Cool");
        } else if (a <= 20.00) {
            System.out.println("Mild");
        } else if (a <= 25.9) {
            System.out.println("Warm");
        } else if (a <= 35.00) {
            System.out.println("Hot");
        } else if (a > 35.00) {
            System.out.println("unknown");
        }
    }
}
