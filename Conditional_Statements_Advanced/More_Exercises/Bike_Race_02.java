import java.util.Scanner;

public class Bike_Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double taxJuniors = 0.0;
        double taxSeniors = 0.0;
        double sum = 0.0;

        switch (trace) {
            case "trail":
                taxJuniors = 5.5;
                taxSeniors = 7;
                sum = juniors * taxJuniors + seniors * taxSeniors;
                break;
            case "cross-country":
                taxJuniors = 8;
                taxSeniors = 9.5;
            
                if (juniors >= 50 || seniors >= 50 || (juniors + seniors) >= 50) {
                    sum = (juniors * taxJuniors + seniors * taxSeniors) * 0.75;
                } else {
                    sum = juniors * taxJuniors + seniors * taxSeniors;
                }
                break;
            case "downhill":
                taxJuniors = 12.25;
                taxSeniors = 13.75;
                sum = juniors * taxJuniors + seniors * taxSeniors;
                break;
            case "road":
                taxJuniors = 20;
                taxSeniors = 21.5;
                sum = juniors * taxJuniors + seniors * taxSeniors;
                break;
        }
        
        double expences = sum * 0.05;
        double result = sum - expences;
        System.out.printf("%.2f", result);

    }
}
