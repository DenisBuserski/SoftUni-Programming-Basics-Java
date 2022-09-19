import java.util.Scanner;

public class Fish_Tank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daljinaCm = Integer.parseInt(scanner.nextLine());
        int shirochinaCm = Integer.parseInt(scanner.nextLine());
        int visochinaCm = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        double obemAkvarium = daljinaCm * shirochinaCm * visochinaCm;
        double litriSubiraemost = obemAkvarium * 0.001;
        double procentChislo = procent * 0.01;
        double litriRealno = litriSubiraemost * (1-procentChislo);

        System.out.printf("%.2f", litriRealno);
    }
}
