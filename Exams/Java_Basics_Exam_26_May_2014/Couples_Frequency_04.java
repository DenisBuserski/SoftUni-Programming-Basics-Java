import java.util.*;

public class Couples_Frequency_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        Map<String, Integer> numbersFrequency = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            String firstNum = numbers[i];
            String nextNum = numbers[i + 1];
            String combination = firstNum.concat(" ").concat(nextNum);

            if (!numbersFrequency.containsKey(combination)) {
                numbersFrequency.put(combination, 1);
            } else {
                Integer currentCount = numbersFrequency.get(combination);
                numbersFrequency.put(combination, currentCount + 1);
            }
        }
        
        int totalValue = numbersFrequency.values().stream().mapToInt(value -> value).sum();

        numbersFrequency.entrySet().forEach(entry -> {
            double percentage = (double) entry.getValue() / totalValue;
            System.out.printf("%s -> %.2f%%%n", entry.getKey(), (percentage * 100));
        });

    }
}
