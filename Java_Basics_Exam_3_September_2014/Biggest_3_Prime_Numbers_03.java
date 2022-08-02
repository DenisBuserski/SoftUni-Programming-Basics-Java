package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Archive.Advanced_Java.Advanced_Java_Exams.Java_Basics_Exam_3_September_2014;

import java.util.*;

public class Biggest_3_Prime_Numbers_03 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String input = str.nextLine();

        //split the input into string array
        String[] stringArray = input.split("[( )]+");

        //parse and add numbers to TreeSet for automatic sorting in reverse order
        TreeSet<Integer> numberSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < stringArray.length; i++) {
            if (!stringArray[i].equals("")) {
                int number = Integer.parseInt(stringArray[i]);
                numberSet.add(number);
            }
        }

        //iterate the numberSet to find the 3 biggest prime numbers
        int primesCount = 0;
        int primesSum = 0;
        for (Integer possiblePrime : numberSet) {

            //exclude the numbers below 1 or all numbers after reaching sum of 3 prime numbers
            if (possiblePrime <= 1 || primesCount == 3) {
                break;
            }

            //check if the current number is prime number
            boolean isPrime = true;
            for (int i = 2; i < possiblePrime; i++) {
                if (possiblePrime % i == 0) {
                    isPrime = false;
                }
            }

            //add the prime number to the sum and incrementing the primesCount
            if (isPrime) {
                primesSum += possiblePrime;
                primesCount++;
            }
        }

        //print the result
        if (primesCount == 3) {
            System.out.println(primesSum);
        } else {
            System.out.println("No");
        }
    }
}
