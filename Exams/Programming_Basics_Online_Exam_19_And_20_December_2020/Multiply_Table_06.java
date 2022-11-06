import java.util.Scanner;

public class Multiply_Table_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;

        while (number > 0) {
            number1 = number % 10;
            number = number / 10;

            number2 = number % 10;
            number = number / 10;

            number3 = number % 10;
            number = number / 10;
        }

        for (int a = 1; a <= number1; a++) {
            for (int b = 1; b <= number2; b++) {
                for (int c = 1; c <= number3; c++) {
                    int result = a * b * c;
                    System.out.printf("%d * %d * %d = %d;%n", a, b, c, result);

                }
            }
        }

    }
}
