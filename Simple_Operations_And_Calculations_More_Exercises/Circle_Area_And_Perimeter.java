import java.util.Scanner;

public class Circle_Area_And_Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double lice = r * r * Math.PI;
        double  perimetar = 2 * r * Math.PI;

        System.out.printf("%.2f", lice);
        System.out.println();
        System.out.printf("%.2f", perimetar);
    }
}
