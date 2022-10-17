import java.util.Scanner;

public class Oscars_Ceremony_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double figurines = rent - (rent * 0.3);
        double catering = figurines - (figurines * 0.15);
        double music = catering / 2;
        double total = rent + figurines + catering + music;

        System.out.printf("%.2f", total);
    }
}
