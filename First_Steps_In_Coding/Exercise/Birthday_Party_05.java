import java.util.Scanner;

public class Birthday_Party_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hall = Integer.parseInt(scanner.nextLine());

        double cake = hall * 0.20;
        double drinks = cake - cake * 0.45;
        int animator = hall / 3;
        double result = hall + cake + drinks + animator;

        System.out.println(result);
    }
}
