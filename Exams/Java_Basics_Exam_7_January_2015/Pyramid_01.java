import java.util.Arrays;
import java.util.Scanner;

public class Pyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String firstLine = scanner.nextLine();

        int currentNumber = Integer.parseInt(firstLine.trim());
        String output = "" + currentNumber;

        for (int i = 1; i < n; i++) {
            String nextLine = scanner.nextLine();
            String[] numbersAsString = nextLine.trim().split("[ ]+");
            int[] numbers = new int[numbersAsString.length];
            for (int j = 0; j < numbersAsString.length; j++) {
                numbers[j] = Integer.parseInt(numbersAsString[j]);
            }

            Arrays.sort(numbers);
            boolean isBreak = false;

            for (int j = 0; j < numbersAsString.length; j++) {
                if (numbers[j] > currentNumber) {
                    currentNumber = numbers[j];
                    output += ", " + currentNumber;
                    isBreak = true;
                    break;
                }
            }

            if (!isBreak) {
                currentNumber++;
            }
        }

        System.out.print(output);
    }
}
