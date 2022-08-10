import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grapeArea = Integer.parseInt(scanner.nextLine());
        double grapeFor1SquareM = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workersNum = Integer.parseInt(scanner.nextLine());

        double totalGrape = grapeArea * grapeFor1SquareM;
        double wine = (0.40 * totalGrape) / 2.5;

        if (wine >= wineNeeded){
            double wineLeft = wine - wineNeeded;
            double wineForWorkers = Math.ceil(wineLeft / workersNum);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.", wineLeft, wineForWorkers);
        } else if (wine < wineNeeded){
            double wineLeft1 = Math.floor(wineNeeded - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", wineLeft1);
        }
        
    }
}
