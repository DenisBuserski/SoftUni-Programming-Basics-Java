import javax.print.attribute.standard.Finishings;
import java.util.Scanner;

import static java.lang.StrictMath.ceil;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearType = scanner.nextLine();
        int holiday = Integer.parseInt(scanner.nextLine());
        int weekend = Integer.parseInt(scanner.nextLine());

        int weekends = 48;
        double weekendsSofia = (weekends - weekend) * (3.0 / 4);
        double holidaysSofia = holiday * (2.0 / 3);
        double totalgames = weekendsSofia + weekend + holidaysSofia;
        
        if (yearType.equals("leap")) {
            double bonusGames = totalgames * 0.15;
            double result = Math.floor(totalgames + bonusGames);
            System.out.println(result);
        } else {
            double result = Math.floor(totalgames);
            System.out.println(result);
        }
        
    }
}
