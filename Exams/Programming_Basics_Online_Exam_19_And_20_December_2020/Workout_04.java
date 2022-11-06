import java.util.Scanner;

public class Workout_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysNum = Integer.parseInt(scanner.nextLine());
        double kmFirstDay = Double.parseDouble(scanner.nextLine());
        double kmFirstDay1 = kmFirstDay;
        double totalKm = 0;

        for (int a = 1; a <= daysNum; a++) {
            double percent = Double.parseDouble(scanner.nextLine());

            double km = kmFirstDay * ((percent + 100) / 100);
            kmFirstDay = km;
            totalKm += km;
        }
        
        totalKm += kmFirstDay1;

        if (totalKm < 1000) {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - totalKm));
        } else {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalKm - 1000));
        }

    }
}
