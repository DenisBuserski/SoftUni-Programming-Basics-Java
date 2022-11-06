import java.util.Scanner;

public class Hair_Salon_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayTarget = Integer.parseInt(scanner.nextLine());
        int income = 0;

        String comand = "";
        while (!comand.equals("closed")) {
            String haircutOrColor = scanner.nextLine();

            if (haircutOrColor.equals("closed")) {
                break;
            }

            if (haircutOrColor.equals("haircut")) {
                String haircut = scanner.nextLine();
                if (haircut.equals("mens")) {
                    income += 15;
                }
                if (haircut.equals("ladies")) {
                    income += 20;
                }
                if (haircut.equals("kids")) {
                    income += 10;
                }
            }
            if (haircutOrColor.equals("color")) {
                String color = scanner.nextLine();
                if (color.equals("touch up")) {
                    income += 20;
                }
                if (color.equals("full color")) {
                    income += 30;
                }
            }
            
            if (income >= dayTarget) {
                System.out.printf("You have reached your target for the day!%n");
                System.out.printf("Earned money: %dlv.", income);
                break;
            }

        }
        
        if (income < dayTarget) {
            System.out.printf("Target not reached! You need %dlv. more.%n", dayTarget - income);
            System.out.printf("Earned money: %dlv.", income);
        }


    }
}
