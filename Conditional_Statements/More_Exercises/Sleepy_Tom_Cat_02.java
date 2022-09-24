import java.util.Scanner;

public class Sleepy_Tom_Cat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDaysNum = Integer.parseInt(scanner.nextLine());
        double playRest = restDaysNum * 127;
        double playWork = (365 - restDaysNum) * 63;
        double totalPlay = playRest + playWork;

        if (totalPlay <= 30000) {
            double result = 30000 - totalPlay;
            double hours = Math.floor(result / 60);
            double minutes = result % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", hours, minutes);
        } else if (totalPlay > 30000) {
            double result  = totalPlay - 30000;
            double hours = Math.floor(result / 60);
            double minutes = result % 60;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", hours, minutes);
        }
        
    }
}
