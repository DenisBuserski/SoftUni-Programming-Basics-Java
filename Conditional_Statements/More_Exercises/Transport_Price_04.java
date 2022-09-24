import java.util.Scanner;

public class Transport_Price_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();
        double taxiDay = (km * 0.79) + 0.70;
        double taxiNight = (km * 0.90) + 0.70;
        double bus = km * 0.09;
        double train = km * 0.06;

        if (km < 20) {
            if (day.equals("day")) { 
                System.out.printf("%.2f", taxiDay); 
            } else { 
                System.out.printf("%.2f", taxiNight); 
            }
        }

        if (km >= 100) {
            if (day.equals("day")) { 
                System.out.printf("%.2f", train); 
            } else { 
                System.out.printf("%.2f", train); 
            }
        }

        if (km >= 20 && km < 100) {
            if (day.equals("day")) { 
                System.out.printf("%.2f", bus); 
            } else { 
                System.out.printf("%.2f", bus); 
            }
        }
        
    }
}
