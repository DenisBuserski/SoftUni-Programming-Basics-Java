import java.util.Scanner;

public class Number_Sequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i += 1) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
        }
        
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
