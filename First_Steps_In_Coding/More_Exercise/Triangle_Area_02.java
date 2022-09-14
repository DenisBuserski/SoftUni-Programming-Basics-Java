import java.util.Scanner;

public class Triangle_Area_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strana = Double.parseDouble(scanner.nextLine());
        double visochina = Double.parseDouble(scanner.nextLine());

        double area = strana * visochina / 2;

        System.out.printf("%.2f", area);
    }
}
