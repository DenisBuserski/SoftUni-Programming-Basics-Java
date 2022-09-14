import java.util.Scanner;

public class Celsius_To_Fahrenheit_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradusiC = Double.parseDouble(scanner.nextLine());
        double gradusiF = gradusiC * 1.8 + 32;

        System.out.printf("%.2f", gradusiF);
    }
}
