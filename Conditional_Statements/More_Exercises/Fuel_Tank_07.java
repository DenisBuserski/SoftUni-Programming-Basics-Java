import java.util.Scanner;

public class Fuel_Tank_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 25) {
            if (fuel.equals("Diesel")) { 
                System.out.println("Fill your tank with diesel!"); 
            } else if (fuel.equals("Gasoline")) { 
                System.out.println("Fill your tank with gasoline!"); 
            } else if (fuel.equals("Gas")) { 
                System.out.println("Fill your tank with gas!"); 
            } else { 
                System.out.println("Invalid fuel!"); 
            }
        } else if (number >= 25) {
            if (fuel.equals("Diesel")) { 
                System.out.println("You have enough diesel."); 
            } else if (fuel.equals("Gasoline")) { 
                System.out.println("You have enough gasoline."); 
            } else if (fuel.equals("Gas")) { 
                System.out.println("You have enough gas."); 
            } else { 
                System.out.println("Invalid fuel!"); 
            }
        }

    }
}
