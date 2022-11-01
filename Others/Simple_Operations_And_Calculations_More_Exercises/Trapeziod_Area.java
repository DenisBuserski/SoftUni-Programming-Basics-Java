import java.util.Scanner;

public class Trapeziod_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double osnovaB1 = Double.parseDouble(scanner.nextLine());
        double osnovaB2 = Double.parseDouble(scanner.nextLine());
        double visochinaH = Double.parseDouble(scanner.nextLine());

        double liceTrapec = (osnovaB1 + osnovaB2) * visochinaH / 2;

        System.out.printf("%.2f", liceTrapec);
    }
}
