import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double finalPrice;
        double finalResult = 0;

        String cocktail = "";
        while (!cocktail.equals("Party!")) {
            cocktail = scanner.nextLine();

            if (cocktail.equals("Party!")) {
                System.out.printf("We need %.2f leva more.%n", income - finalResult);
                System.out.printf("Club income - %.2f leva.", finalResult);
                break;
            }
            
            int cocktailNum = Integer.parseInt(scanner.nextLine());

            int price = cocktail.length();
            finalPrice = price * cocktailNum;
            if (finalPrice % 2 != 0) {
                finalPrice *= 0.75;
            }

            finalResult += finalPrice;
            if (finalResult >= income) {
                System.out.printf("Target acquired.%n");
                System.out.printf("Club income - %.2f leva.", finalResult);
                break;
            }
        }
        
    }
}
