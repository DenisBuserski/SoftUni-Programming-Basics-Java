package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Archive.Advanced_Java.Advanced_Java_Exams.Java_Basics_Exam_21_Sept_2014_Morning;

import java.util.Scanner;

public class Timespan_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] startTime = scanner.nextLine().split(":");
        String [] endTime = scanner.nextLine().split(":");
        // 00 -> 59
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        int startHours = Integer.parseInt(startTime[0]);
        int startMinutes = Integer.parseInt(startTime[1]);
        int startSeconds = Integer.parseInt(startTime[2]);

        int endHours = Integer.parseInt(endTime[0]);
        int endMinutes = Integer.parseInt(endTime[1]);
        int endSeconds = Integer.parseInt(endTime[2]);

        if (startSeconds - endSeconds >= 0) {
            seconds = startSeconds - endSeconds;
        } else {
            startMinutes--;
            seconds = 60 - endSeconds;
            seconds += startSeconds;
        }

        if (startMinutes - endMinutes >= 0) {
            minutes = startMinutes - endMinutes;
        } else {
            startHours--;
            minutes = 60 - endMinutes;
            minutes += startMinutes;
        }

        hours = startHours - endHours;

        System.out.printf("%d:%02d:%02d ", hours, minutes, seconds);
    }
}
