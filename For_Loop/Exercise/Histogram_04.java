import java.util.Scanner;

public class Histogram_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        int counterP1 = 0;
        int counterP2 = 0;
        int counterP3 = 0;
        int counterP4 = 0;
        int counterP5 = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 800) {
                counterP5++;
            } else if (num >= 600) {
                counterP4++;
            } else if (num >= 400) {
                counterP3++;
            } else if (num >= 200) {
                counterP2++;
            } else {
                counterP1++;
            }
        }
        
        System.out.printf("%.2f%%%n", (double) counterP1 / n * 100);
        System.out.printf("%.2f%%%n", (double) counterP2 / n * 100);
        System.out.printf("%.2f%%%n", (double) counterP3 / n * 100);
        System.out.printf("%.2f%%%n", (double) counterP4 / n * 100);
        System.out.printf("%.2f%%%n", (double) counterP5 / n * 100);
    }
}
