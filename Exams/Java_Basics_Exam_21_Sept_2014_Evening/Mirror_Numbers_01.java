import java.util.Arrays;
import java.util.Scanner;

public class Mirror_Numbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        for (int index1 = 0; index1 < numbers.length; index1++) {
            for (int index2 = index1 + 1; index2 < numbers.length; index2++) {
                int reverseSecondNumber = getRevered(numbers[index2]);

                if (numbers[index1] == reverseSecondNumber) {
                    System.out.printf("%d<!>%d%n", numbers[index1], numbers[index2]);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        }

    }

    private static int getRevered(int secondNumber) {
        int reversed = 0;
        while (secondNumber != 0) {
            int digit = secondNumber % 10;
            reversed = reversed * 10 + digit;
            secondNumber /= 10;
        }
        return reversed;
    }
    
}
