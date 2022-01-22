package SimpleOperationsAndCalculationsMoreExercises;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strana = Double.parseDouble(scanner.nextLine());
        double visochina = Double.parseDouble(scanner.nextLine());

        double area = strana * visochina / 2;

        System.out.printf("%.2f", area);

    }
}
