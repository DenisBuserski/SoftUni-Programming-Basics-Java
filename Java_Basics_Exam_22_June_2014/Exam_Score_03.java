package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Archive.Advanced_Java.Advanced_Java_Exams.Java_Basics_Exam_22_June_2014;

import java.util.*;

public class Exam_Score_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();

        Map<Integer, List<String> > students = new TreeMap<>();
        Map<Integer, List<Double> > grades = new HashMap<>();

        String input;
        while (!"--------------------------------------------".contains(input = scanner.nextLine())) {
            String [] tokens = input.split("[\\s+\\|\\s+]+");

            String firstName = tokens[1];
            String lastName = tokens[2];
            String fullName = firstName + " " + lastName;
            int examScore = Integer.parseInt(tokens[3]);
            double grade = Double.parseDouble(tokens[4]);

            fillStudentsMap(students, fullName, examScore);

            fillGradesMap(grades, examScore, grade);

        }

        for (Map.Entry<Integer, List<String>> entry : students.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            Collections.sort(entry.getValue());
            System.out.print(entry.getValue() + "; ");
            double average = grades.get(entry.getKey()).stream().mapToDouble(a -> a).average().orElse(0.0);
            System.out.printf("avg=%.2f%n", average);
        }


    }

    public static void fillGradesMap(Map<Integer, List<Double>> grades, int examScore, double grade) {
        if (!grades.containsKey(examScore)) {
            grades.put(examScore, new ArrayList<>());
            grades.get(examScore).add(grade);
        } else {
            grades.get(examScore).add(grade);
        }
    }

    public static void fillStudentsMap(Map<Integer, List<String>> students, String fullName, Integer examScore) {
        if (!students.containsKey(examScore)) {
            students.put(examScore, new ArrayList<>());
            students.get(examScore).add(fullName);
        } else {
            students.get(examScore).add(fullName);
        }
    }
}
