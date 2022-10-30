import java.util.*;

public class Biggest_3_Prime_Numbers_03 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String input = str.nextLine();
        
        String[] stringArray = input.split("[( )]+"); // Split the input into string array

        TreeSet<Integer> numberSet = new TreeSet<>(Collections.reverseOrder()); // Parse and add numbers to TreeSet for automatic sorting in reverse order
        for (int i = 0; i < stringArray.length; i++) {
            if (!stringArray[i].equals("")) {
                int number = Integer.parseInt(stringArray[i]);
                numberSet.add(number);
            }
        }

        // Iterate the numberSet to find the 3 biggest prime numbers
        int primesCount = 0;
        int primesSum = 0;
        for (Integer possiblePrime : numberSet) {
            // Exclude the numbers below 1 or all numbers after reaching sum of 3 prime numbers
            if (possiblePrime <= 1 || primesCount == 3) {
                break;
            }

            // Check if the current number is prime number
            boolean isPrime = true;
            for (int i = 2; i < possiblePrime; i++) {
                if (possiblePrime % i == 0) {
                    isPrime = false;
                }
            }

            // Add the prime number to the sum and incrementing the primesCount
            if (isPrime) {
                primesSum += possiblePrime;
                primesCount++;
            }
        }

        // Print the result
        if (primesCount == 3) {
            System.out.println(primesSum);
        } else {
            System.out.println("No");
        }
    }
}
