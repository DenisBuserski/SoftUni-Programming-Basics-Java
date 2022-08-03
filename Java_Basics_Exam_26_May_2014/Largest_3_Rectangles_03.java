package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Archive.Advanced_Java.Advanced_Java_Exams.Java_Basics_Exam_26_May_2014;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Largest_3_Rectangles_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<first>[\\d]+)\\s*x\\s*(?<second>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int firstArea = 0;
        int secondArea = 0;
        int thirdArea = 0;
        int biggestArea = -1;

        while (matcher.find()) {
            int first = Integer.parseInt(matcher.group("first"));
            int second = Integer.parseInt(matcher.group("second"));

            if (firstArea == 0 && secondArea == 0 && thirdArea == 0) {
                firstArea = first * second;
            } else if (secondArea == 0 && firstArea != 0 && thirdArea == 0) {
                secondArea = first * second;
            } else if (thirdArea == 0 && firstArea != 0 && secondArea != 0) {
                thirdArea = first * second;
            } else {
                firstArea = secondArea;
                secondArea = thirdArea;
                thirdArea = first * second;
            }

            if (firstArea + secondArea + thirdArea > biggestArea) {
                biggestArea = firstArea + secondArea + thirdArea;
            }
        }


        System.out.println(biggestArea);
    }
}
