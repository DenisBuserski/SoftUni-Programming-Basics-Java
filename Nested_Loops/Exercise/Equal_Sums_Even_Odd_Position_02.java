import java.util.Scanner;

public class Equal_Sums_Even_Odd_Position_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            int number = i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 6; j >= 1; j--) {
                int digit = number % 10;
                number = number / 10;

                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }

    }
}
