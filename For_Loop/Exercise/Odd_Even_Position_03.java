import java.util.Scanner;

public class Odd_Even_Position_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0.0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenSum = 0.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 != 0) {
                oddSum += num;
                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax) {
                    oddMax= num;
                }
            } else {
                evenSum += num;
                if (num < evenMin) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax= num;
                }
            }
        }

        if (n == 0) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=No,%n");
            System.out.printf("OddMax=No,%n");
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=No,%n");
            System.out.printf("EvenMax=No");
        } else if (n <= 1) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=No,%n");
            System.out.printf("EvenMax=No");
        } else {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);
        }

    }
}
