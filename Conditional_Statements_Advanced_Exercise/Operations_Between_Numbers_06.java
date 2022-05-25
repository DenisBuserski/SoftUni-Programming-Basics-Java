import java.util.Scanner;

public class Operations_Between_Numbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double result = 0;

        if ("+".equals(symbol)) {
            result = num1 + num2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", num1, symbol, num2, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", num1, symbol, num2, result);
            }
        } else if ("-".equals(symbol)) {
            result = num1 - num2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", num1, symbol, num2, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", num1, symbol, num2, result);
            }
        } else if ("*".equals(symbol)) {
            result = num1 * num2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", num1, symbol, num2, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", num1, symbol, num2, result);
            }
        } else if ("/".equals(symbol)) {
            result = (double) num1 / num2;
            if (num2 > 0) {
                System.out.printf("%d %s %d = %.2f", num1, symbol, num2, result);

            } else if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            }
        } else if ("%".equals(symbol)) {
            result = (double) num1 % num2;
            if (num2 > 0) {
                System.out.printf("%d %s %d = %.0f", num1, symbol, num2, result);
            } else if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            }
        }
        
    }
}
