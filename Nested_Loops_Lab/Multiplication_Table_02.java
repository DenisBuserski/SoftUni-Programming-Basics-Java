import java.util.Scanner;

public class Multiplication_Table_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                result = a * b;
                System.out.printf("%d * %d = %d%n", a, b, result);
            }
        }

    }
}
