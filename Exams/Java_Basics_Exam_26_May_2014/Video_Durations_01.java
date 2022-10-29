import java.util.Scanner;

public class Video_Durations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalHours = 0;
        int totalMinutes = 0;

        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            String [] tokens = input.split(":");
            int hours = Integer.parseInt(tokens[0]);
            int minutes = Integer.parseInt(tokens[1]);

            totalHours += hours;

            if (totalMinutes + minutes <= 59) {
                totalMinutes += minutes;
            } else {
                totalHours++;
                totalMinutes = (minutes + totalMinutes) - 60;
            }
        }
        
        if (String.valueOf(totalMinutes).length() == 1) {
            System.out.printf("%d:0%d", totalHours, totalMinutes);
        } else {
            System.out.printf("%d:%d", totalHours, totalMinutes);
        }
    }
}
