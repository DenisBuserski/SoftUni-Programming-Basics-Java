import java.util.Scanner;

public class House_Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double green = 3.40;
        double red = 4.30;

        double wallWithWindow = x * y;
        double window = 1.50 * 1.50;
        double wallsWithWindows = wallWithWindow * 2 - 2 * window;

        double backWall = x * x;
        double entrance = 1.20 * 2;
        double wallFrontBack = backWall * 2 - entrance;

        double allWalls = wallsWithWindows + wallFrontBack;
        double greenPaint = allWalls / green;


        double roof = 2 * (x * y);
        double roof1 = (x * h / 2);
        double roof2 = 2 * roof1;

        double roof3 = roof + roof2;
        double redPaint = roof3 / red;

        System.out.printf("%.2f", greenPaint);
        System.out.println();
        System.out.printf("%.2f", redPaint);
    }
}
