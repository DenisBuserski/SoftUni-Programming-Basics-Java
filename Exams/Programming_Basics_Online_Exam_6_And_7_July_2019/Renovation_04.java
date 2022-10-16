import java.util.Scanner;

public class Renovation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());
        double percentage1 = percentage / 100;
        double totalSurface = height * width * 4;
        double wallsToPaint = totalSurface - (totalSurface * percentage1);

        String comand = "";
        while (!comand.equals("Tired!")) {
            comand = scanner.nextLine();

            if (comand.equals("Tired!")) {
                System.out.printf("%.0f quadratic m left.", wallsToPaint);
                break;
            } else {
                int paintNum = Integer.parseInt(comand);
                wallsToPaint -= paintNum;
            }

            if (wallsToPaint < 0) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(wallsToPaint));
                break;
            }
            if (wallsToPaint == 0) {
                System.out.println("All walls are painted! Great job, Pesho!");
                break;
            }
        }
        
    }
}

