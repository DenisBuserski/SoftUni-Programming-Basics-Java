import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double result = 0.0;

        switch (type) {
            case "Premiere":
                result = r * c * 12;
                System.out.printf("%.2f", result);
                break;
            case "Normal":
                result = r * c * 7.5;
                System.out.printf("%.2f", result);
                break;
            case "Discount":
                result = r * c * 5;
                System.out.printf("%.2f", result);
                break;
        }
        
    }
}
