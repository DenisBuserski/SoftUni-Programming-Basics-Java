package ForLoopMoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    int months = Integer.parseInt(scanner.nextLine());

    double water = 20;
    double internet = 15;
    double other = 0;

    double waterBill = 0;
    double internetBill = 0;
    double electricityBill = 0;
    double otherBill = 0;
    double avr = 0;

    for(
    int i = 1; i <= months; i++) {
        double electricity = Double.parseDouble(scanner.nextLine());

        electricityBill += electricity;
        waterBill += water;
        internetBill += internet;
        otherBill = (electricityBill + waterBill + internetBill) * 1.2;
    }

    avr = (electricityBill + waterBill + internetBill + otherBill) / months;
    System.out.printf("Electricity: %.2f lv%n", electricityBill);
    System.out.printf("Water: %.2f lv%n", waterBill);
    System.out.printf("Internet: %.2f lv%n", internetBill);
    System.out.printf("Other: %.2f lv%n", otherBill);
    System.out.printf("Average: %.2f lv", avr);

    }
}
