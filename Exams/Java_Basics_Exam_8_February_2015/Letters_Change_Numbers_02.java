import java.util.Scanner;

public class Letters_Change_Numbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split("\\s+");
        double totalSum = 0;

        for (String entry : words) {
            String [] letters = entry.split("[0-9]+");
            String firstLetter = letters[0];
            String lastLetter = letters[1];
            String [] numbers = entry.split("[A-z]+");
            double number = Double.parseDouble(numbers[1]);
            double currentSum = 0;
            int firstLetterNum = 0;
            int LastLetterNum = 0;

            if (firstLetter.charAt(0) >= 65 && firstLetter.charAt(0) <= 90) { // First letter - Upper
                firstLetterNum = firstLetter.charAt(0) - 64;
                currentSum = number / firstLetterNum;
            } else if (firstLetter.charAt(0) >= 97 && firstLetter.charAt(0) <= 122) { // First letter Lower
                firstLetterNum = firstLetter.charAt(0) - 96;
                currentSum = number * firstLetterNum;
            }

            if (lastLetter.charAt(0) >= 65 && lastLetter.charAt(0) <= 90) { // Last letter - Upper
                LastLetterNum = lastLetter.charAt(0) - 64;
                currentSum -= LastLetterNum;
            } else if (lastLetter.charAt(0) >= 97 && lastLetter.charAt(0) <= 122) { // Last letter Lower
                LastLetterNum = lastLetter.charAt(0) - 96;
                currentSum += LastLetterNum;
            }
            
            totalSum += currentSum;
        }

        System.out.printf("%.2f", totalSum);
    }
}
