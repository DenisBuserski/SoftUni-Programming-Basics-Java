import java.util.Scanner;

public class Gandalfs_Stash_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingMood = Integer.parseInt(scanner.nextLine());
        String [] input = scanner.nextLine().split("[^a-zA-Z]+\\s*");

        for (String food : input) {
            switch (food.toLowerCase()) {
                case "cram":
                    startingMood += 2;
                    break;
                case "lembas":
                    startingMood += 3;
                    break;
                case "apple":
                case "melon":
                    startingMood += 1;
                    break;
                case "honeycake":
                    startingMood += 5;
                    break;
                case "mushrooms":
                    startingMood -= 10;
                    break;
                default:
                    startingMood -= 1;
                    break;
            }
        }

        System.out.println(startingMood);
        
        if (startingMood < -5) {
            System.out.println("Angry");
        } else if (startingMood >= -5 && startingMood <= 0) {
            System.out.println("Sad");
        } else if (startingMood >= 0 && startingMood <= 15) {
            System.out.println("Happy");
        } else if (startingMood > 15) {
            System.out.println("Special JavaScript mood");
        }

    }
}
