import java.util.Scanner;

public class Multiply_By_2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i >= 0; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (number >= 0) {
                number = number * 2;
                System.out.printf("Result: %.2f%n", number);
            } else {
                System.out.println("Negative number!");
                break;
            }
        }

    }
}
