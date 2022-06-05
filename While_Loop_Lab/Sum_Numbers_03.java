import java.util.Scanner;

public class Sum_Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < initialNumber) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + inputNumber;
        }
        
        System.out.println(sum);
    }
}
