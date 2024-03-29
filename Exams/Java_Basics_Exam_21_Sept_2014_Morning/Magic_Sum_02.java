import java.util.ArrayList;
import java.util.Scanner;

public class Magic_Sum_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> inputNumbers = new ArrayList<>();
        int divider = Integer.parseInt(scanner.nextLine());

        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            inputNumbers.add(Integer.parseInt(input));
        }

        long maxSum = Integer.MIN_VALUE;

        String result = "";
        int resultCounter = 0;
        for (int i = 0; i < inputNumbers.size(); i++) {
            for (int i1 = i + 1; i1 < inputNumbers.size(); i1++) {
                for (int i2 = i1 + 1; i2 < inputNumbers.size(); i2++) {
                    long sum = inputNumbers.get(i) + inputNumbers.get(i1) + inputNumbers.get(i2);

                    if (sum % divider == 0 && sum > maxSum) {
                        maxSum = sum;
                        result = String.format("(%d + %d + %d) %% %d = 0",
                                inputNumbers.get(i), inputNumbers.get(i1), inputNumbers.get(i2), divider);
                        resultCounter++;
                    }
                }
            }
        }

        if (resultCounter == 0) {
            System.out.println("No");
        } else {
            System.out.println(result);
        }

    }
}
