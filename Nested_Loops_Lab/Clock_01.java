import java.util.Scanner;

public class Clock_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int hours = 0; hours < 24; hours++) {
            for (int min = 0; min < 60; min++) {
                System.out.printf("%d:%d%n", hours, min);
            }
        }
        
    }
}
