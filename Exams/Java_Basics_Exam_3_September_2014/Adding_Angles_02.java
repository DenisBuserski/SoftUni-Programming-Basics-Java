import java.util.Arrays;
import java.util.Scanner;

public class Adding_Angles_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int sum = 0;

        if (numbers.length == n) {
            for (int firstIndex = 0; firstIndex < n; firstIndex++) {
                firstNumber = numbers[firstIndex];

                for (int secondIndex = firstIndex + 1; secondIndex < n; secondIndex++) {
                    secondNumber = numbers[secondIndex];

                    for (int thirdIndex = secondIndex + 1; thirdIndex < n; thirdIndex++) {
                        thirdNumber = numbers[thirdIndex];

                        if ((firstNumber + secondNumber + thirdNumber) % 360 == 0) {
                            sum = firstNumber + secondNumber + thirdNumber;
                            System.out.printf("%d + %d + %d = %d degrees%n", firstNumber, secondNumber, thirdNumber, sum);
                        }

                        if (n == 3) {
                            break;
                        }
                    }
                    if (n == 3) {
                        break;
                    }
                }
                if (n == 3) {
                    break;
                }

            }
        }

        if (sum == 0) {
            System.out.printf("No%n");
        }

    }
}
