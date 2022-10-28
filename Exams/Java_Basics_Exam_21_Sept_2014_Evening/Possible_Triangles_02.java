import java.util.Scanner;

public class Possible_Triangles_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");
            double min1 = Double.MAX_VALUE;;
            double min2 = Double.MAX_VALUE;;
            double biggestNum = Double.MIN_VALUE;

            for (int index = 0; index < tokens.length; index++) {
                double number = Double.parseDouble(tokens[index]);

                if (number < min1) {
                    min2 = min1;
                    min1 = number;
                } else if (number < min2 && number != min1) {
                    min2 = number;
                }

                if (number > biggestNum) {
                    biggestNum = number;
                }
            }

            if (min1 + min2 > biggestNum) {
                System.out.printf("%.2f+%.2f>%.2f%n", min1, min2, biggestNum);
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("No");
        }
    }
}
