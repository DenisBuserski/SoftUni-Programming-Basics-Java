import java.util.Scanner;

public class Training_Lab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double hInCm = h * 100;
        double wInCm = w * 100;
        int desk1 = 70;
        int desk2 = 120;

        double hWithoutCorridor = hInCm - 100;
        int desksOnRow = (int) (hWithoutCorridor / desk1);

        int rows = (int) (wInCm / desk2);

        int result = (desksOnRow * rows) - 3;

        System.out.println(result);
    }
}
