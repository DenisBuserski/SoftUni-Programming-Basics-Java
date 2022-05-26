import java.util.Scanner;

public class Easter_Bakery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsNum = Integer.parseInt(scanner.nextLine());
        int yeast = Integer.parseInt(scanner.nextLine());

        double sugarPrice = flourPrice * 0.75;
        double eggsPrice = flourPrice * 1.1;
        double yeastPrice = sugarPrice * 0.2;

        double flourSum = flourPrice * flourKg;
        double sugarSum = sugarPrice * sugarKg;
        double eggsSum = eggsPrice * eggsNum;
        double yeastSum = yeastPrice * yeast;

        double finalResult = flourSum + sugarSum + eggsSum + yeastSum;
        System.out.printf("%.2f", finalResult);
    }
}
