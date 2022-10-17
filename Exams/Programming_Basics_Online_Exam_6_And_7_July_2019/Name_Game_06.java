import java.util.Scanner;

public class Name_Game_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int points = 0;
        int pointsMAX = Integer.MIN_VALUE;
        String nameChamp = "";
        String nameSecond = "";

        while (!name.equals("Stop")) {
            name = scanner.nextLine();

            if (name. equals("Stop")) {
                break;
            }
            points = 0;


            for (int n = 0; n < name.length(); n++) {
                int number = Integer.parseInt(scanner.nextLine());
                char letter = name.charAt(n);
                if (letter == number) {
                    points += 10;
                } else {
                    points += 2;
                }
            }
            
            if (points > pointsMAX) {
                pointsMAX = points;
                nameChamp = name;
            } else if (points == pointsMAX) {
                pointsMAX = points;
                nameChamp = name;
            }

        }
        
        System.out.printf("The winner is %s with %d points!", nameChamp, pointsMAX);
    }
}
