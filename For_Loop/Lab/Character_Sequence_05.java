import java.util.Scanner;

public class Character_Sequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int length = text.length();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
        
    }
}
