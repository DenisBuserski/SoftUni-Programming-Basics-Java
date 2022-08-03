package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Archive.Advanced_Java.Advanced_Java_Exams.Java_Basics_Exam_21_Sept_2014_Evening;

import java.util.*;
import java.util.stream.Collectors;

public class Office_Stuff_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer> > info = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String [] input = scanner.nextLine().split("[\\|\\s+-]");
            String company = input[1];
            int amount = Integer.parseInt(input[4]);
            String material = input[7];




            if (!info.containsKey(company)) {
                info.put(company, new LinkedHashMap<>());
                info.get(company).put(material, amount);
            } else {

                if (!info.get(company).containsKey(material)) {
                    info.get(company).put(material, amount);
                } else {
                    int current = info.get(company).get(material);
                    info.get(company).put(material, amount + current);
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


            print = toSort.stream().map(e -> String.format("%s-%d", e.getKey(), e.getValue())).collect(Collectors.toList());

            System.out.print(print.toString().replaceAll("[\\[\\]]", ""));
            print.clear();

            System.out.println();



        }
    }
}
