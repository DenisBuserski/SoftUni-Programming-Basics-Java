import java.util.Scanner;

public class Fuel_Tank_Part_2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelForCar = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double gasoline = 2.22;
        double diesel = 2.33;
        double gas = 0.93;

        double gasolineDiscount = gasoline - 0.18;
        double dieselDiscount = diesel - 0.12;
        double gasDiscount = gas - 0.08;

        double gasolineWithoutD = fuel * gasoline;
        double gasolineWithD = fuel * gasolineDiscount;
        double dieselWithoutD = fuel * diesel;
        double dieselWithD = fuel * dieselDiscount;
        double gasWithoutD = fuel * gas;
        double gasWithD = fuel * gasDiscount;

        if (fuel >= 20 && fuel <= 25) {
            if (card.equals("Yes")) {
                if (fuelForCar.equals("Gasoline")){ System.out.printf("%.2f lv.", gasolineWithD - (gasolineWithD * 0.08)); }
                if (fuelForCar.equals("Diesel")){ System.out.printf("%.2f lv.", dieselWithD - (dieselWithD * 0.08)); }
                if (fuelForCar.equals("Gas")){ System.out.printf("%.2f lv.", gasWithD - (gasWithD * 0.08)); }
            } else if (card.equals("No")) {
                if (fuelForCar.equals("Gasoline")) { System.out.printf("%.2f lv.", gasolineWithoutD - (gasolineWithoutD * 0.08)); }
                if (fuelForCar.equals("Diesel")) { System.out.printf("%.2f lv.", dieselWithoutD - (dieselWithoutD * 0.08)); }
                if (fuelForCar.equals("Gas")) { System.out.printf("%.2f lv.", gasWithoutD - (gasWithoutD * 0.08)); }
            }
        } else if (fuel > 25) {
            if (card.equals("Yes")) {
                if (fuelForCar.equals("Gasoline")) { System.out.printf("%.2f lv.", gasolineWithD - (gasolineWithD * 0.10)); }
                if (fuelForCar.equals("Diesel")) { System.out.printf("%.2f lv.", dieselWithD - (dieselWithD * 0.10)); }
                if (fuelForCar.equals("Gas")) { System.out.printf("%.2f lv.", gasWithD - (gasWithD * 0.10)); }
            } else if (card.equals("No")) {
                if (fuelForCar.equals("Gasoline")) { System.out.printf("%.2f lv.", gasolineWithoutD - (gasolineWithoutD * 0.10)); }
                if (fuelForCar.equals("Diesel")) { System.out.printf("%.2f lv.", dieselWithoutD - (dieselWithoutD * 0.10)); }
                if (fuelForCar.equals("Gas")) { System.out.printf("%.2f lv.", gasWithoutD - (gasWithoutD * 0.10)); }
            }
        } else if (fuel < 20) {
            if (card.equals("Yes")) {
                if (fuelForCar.equals("Gasoline")) { System.out.printf("%.2f lv.", gasolineWithD); }
                if (fuelForCar.equals("Diesel")) { System.out.printf("%.2f lv.", dieselWithD); }
                if (fuelForCar.equals("Gas")) { System.out.printf("%.2f lv.", gasWithD); }
            } else if (card.equals("No")) {
                if (fuelForCar.equals("Gasoline")) { System.out.printf("%.2f lv.", gasolineWithoutD); }
                if (fuelForCar.equals("Diesel")) { System.out.printf("%.2f lv.", dieselWithoutD); }
                if (fuelForCar.equals("Gas")) { System.out.printf("%.2f lv.", gasWithoutD); }
            }
        }
        
    }
}
