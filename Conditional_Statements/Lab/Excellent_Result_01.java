import java.util.Scanner;

public class Excellent_Result_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("The grade is smaller than 5!");
        }
    }
}
