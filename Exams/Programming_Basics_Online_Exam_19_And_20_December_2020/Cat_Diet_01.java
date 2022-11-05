import java.util.Scanner;

public class Cat_Diet_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fatP = Double.parseDouble(scanner.nextLine());
        double proteinP = Double.parseDouble(scanner.nextLine());
        double carbsP = Double.parseDouble(scanner.nextLine());
        double total = Double.parseDouble(scanner.nextLine());
        double waterP = Double.parseDouble(scanner.nextLine());

        double fat = ((fatP / 100) * total) / 9;
        double protein = ((proteinP / 100) * total) / 4;
        double carbs = ((carbsP / 100) * total) / 4;

        double totalFood = fat + protein + carbs;
        double result = total / totalFood;
        double result1 = ((100 - waterP) / 100) * result;
        
        System.out.printf("%.4f", result1);
    }
}
