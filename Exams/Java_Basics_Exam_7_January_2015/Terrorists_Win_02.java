import java.util.Scanner;

public class Terrorists_Win_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        int currentIndex = 0,
                bombStartIndex = 0,
                bombEndIndex;

        while ((bombStartIndex = text.indexOf("|", currentIndex)) != -1) {
            bombEndIndex = text.indexOf("|", bombStartIndex + 1);
            String bombContent = text.substring(bombStartIndex + 1, bombEndIndex);

            int bombPower = getBombPower(bombContent),
                    startIndex = Math.max(0, bombStartIndex - bombPower),
                    endIndex = Math.min(text.length() - 1, bombEndIndex + bombPower);

            while (startIndex <= endIndex) {
                text.setCharAt(startIndex, '.');
                startIndex++;
            }

            currentIndex = bombEndIndex + 1;
        }

        System.out.println(text);
    }

    private static int getBombPower(String bombContent) {
        int bombPower = 0;
        for (char ch : bombContent.toCharArray()) {
            bombPower += ch;
        }

        return bombPower % 10;
    }
}
