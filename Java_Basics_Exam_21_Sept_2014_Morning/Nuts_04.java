package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Archive.Advanced_Java.Advanced_Java_Exams.Java_Basics_Exam_21_Sept_2014_Morning;

import java.util.*;
import java.util.stream.Collectors;

public class Nuts_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer> > info = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String [] input = scanner.nextLine().split("\\s+");
            String company = input[0];
            String nuts = input[1];
            StringBuilder amountString = new StringBuilder(input[2]);
            amountString.delete(input[2].length() - 2, input[2].length());

            int amount = Integer.parseInt(amountString.toString());


            if (!info.containsKey(company)) {
                info.put(company, new LinkedHashMap<>());
                info.get(company).put(nuts, amount);
            } else {

                if (!info.get(company).containsKey(nuts)) {
                    info.get(company).put(nuts, amount);
                } else {
                    int current = info.get(company).get(nuts);
                    info.get(company).put(nuts, amount + current);
                }
            }
        }


        for (Map.Entry<String, Map<String, Integer>> entry : info.entrySet()) {
            System.out.print(entry.getKey() + ": ");

            List<String> print;
            List<Map.Entry<String, Integer>> toSort = new ArrayList<>();

            toSort.addAll(entry
                    .getValue()
                    .entrySet());


            print = toSort.stream().map(e -> String.format("%s-%dkg", e.getKey(), e.getValue())).collect(Collectors.toList());

            System.out.print(print.toString().replaceAll("[\\[\\]]", ""));
            print.clear();

            System.out.println();



        }


    }
}
