package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Archive.Advanced_Java.Advanced_Java_Exams.Java_Basics_Exam_11_May_2015;

import java.util.Scanner;

public class Enigma_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] lines = new String[n];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine();
        }

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            String withoutWhitespacesAndNumbers = line.replaceAll("\\s*\\d*","");
            int length = withoutWhitespacesAndNumbers.length() / 2;

            for (int j = 0; j < line.length(); j++) {
                if (Character.isDigit(line.charAt(j))) {
                    System.out.print(line.charAt(j));
                }

                else if (line.charAt(j) == ' ') {
                    System.out.print(" ");
                }

                else {
                    int ascii = (int) line.charAt(j);
                    System.out.print((char) (ascii + length));
                }
            }

            System.out.println();
        }
    }
}
