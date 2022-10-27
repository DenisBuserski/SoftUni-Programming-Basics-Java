import java.util.*;
import java.util.stream.Collectors;

public class Weightlifting_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Long> > info = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String [] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            String exercise = tokens[1];
            long weight = Long.parseLong(tokens[2]);

            if (!info.containsKey(name)) {
                info.put(name, new TreeMap<>());
                info.get(name).put(exercise, weight);
            } else {
                if (!info.get(name).containsKey(exercise)) {
                    info.get(name).put(exercise, weight);
                } else {
                    long currentWeight = info.get(name).get(exercise);
                    info.get(name).put(exercise, currentWeight + weight);
                }
            }
        }


        for (Map.Entry<String, Map<String, Long>> entry : info.entrySet()) {
            System.out.print(entry.getKey() + " : ");

            List<String> print;
            List<Map.Entry<String, Long>> toSort = new ArrayList<>();

            for (Map.Entry<String, Long> e : entry
                    .getValue()
                    .entrySet()) {
                toSort.add(e);
            }
            
            toSort.sort((a, b) -> a.getKey().compareTo(b.getKey()));

            print = toSort.stream().map(e -> String.format("%s - %d kg", e.getKey(), e.getValue())).collect(Collectors.toList());

            System.out.print(print.toString().replaceAll("[\\[\\]]", ""));
            print.clear();
            System.out.println();
        }
        
    }
}
