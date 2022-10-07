import java.util.Scanner;

public class Football_League_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stadium = Double.parseDouble(scanner.nextLine());
        double fans = Double.parseDouble(scanner.nextLine());
        double a = 0;
        double b = 0;
        double v = 0;
        double g = 0;

        for(int i = 1; i <= fans; i++) {
            String stand = scanner.nextLine();
            switch (stand) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "V":
                    v++;
                    break;
                case "G":
                    g++;
                    break;
            }
        }

        double aP = (a / fans) * 100;
        double bP = (b / fans) * 100;
        double vP = (v / fans) * 100;
        double gP = (g / fans) * 100;
        double all = (fans / stadium) * 100;

        System.out.printf("%.2f%%%n", aP);
        System.out.printf("%.2f%%%n", bP);
        System.out.printf("%.2f%%%n", vP);
        System.out.printf("%.2f%%%n", gP);
        System.out.printf("%.2f%%", all);
    }
}
