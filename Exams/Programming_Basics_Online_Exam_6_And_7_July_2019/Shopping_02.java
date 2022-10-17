import java.util.Scanner;

public class Shopping_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videocardsPrice = videocards * 250;
        double processorsPrice = (0.35 * videocardsPrice) * processors;
        double ramPrice = (0.1 * videocardsPrice) * ram;
        double totalPrice = videocardsPrice + processorsPrice + ramPrice;
        
        if (videocards > processors) {
            totalPrice *= 0.85;
            if (totalPrice <= budget) {
                System.out.printf("You have %.2f leva left!", budget - totalPrice);
            } else {
                System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
            }
        } else {
            if (totalPrice <= budget) {
                System.out.printf("You have %.2f leva left!", budget - totalPrice);
            } else {
                System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
            }
        }
    }
}
