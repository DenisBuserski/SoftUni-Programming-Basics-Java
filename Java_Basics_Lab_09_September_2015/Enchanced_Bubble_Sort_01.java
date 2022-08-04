package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Archive.Advanced_Java.Advanced_Java_Exams.Java_Basics_Lab_09_September_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Enchanced_Bubble_Sort_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().replace("[", "").replace("]", "").split(", ");
        ArrayList<Integer> numbersArr = new ArrayList<Integer>();

        //TODO: Parse the numbers and add them to the list

//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
        for (String number : numbers) {
            numbersArr.add(Integer.parseInt(number));
        }

        //TODO: Write the sorting algorithm that you use for sorting the List's elements

        // Collections.sort(numbersArr);
        for (int i = 0; i < numbersArr.size(); i++) {
            for (int j = i + 1; j < numbersArr.size(); j++) {
                if (numbersArr.get(j) < numbersArr.get(i)) {
                    final int tmp = numbersArr.get(i);
                    numbersArr.set(i, numbersArr.get(j));
                    numbersArr.set(j, tmp);
                }
            }
        }



//        stopWatch.stop();
//        long time = stopWatch.getTime();

        System.out.println(numbersArr);
//        System.out.println(time/1000.0);3
    }
}
