import java.util.*;
import java.util.stream.Collectors;

public class Activity_Tracker_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String monthNum = "";
        Map<String, Map<String, Integer>> tracker = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String date = input[0];
            String user = input[1];
            int distance = Integer.parseInt(input[2]);

            String month = date.split("/")[1];
            if (month.startsWith("0")) {
                monthNum = month.split("")[1];
            } else {
                monthNum = month;
            }

            if (!tracker.containsKey(monthNum)) {
                tracker.put(monthNum, new TreeMap<>());
                tracker.get(monthNum).put(user, distance);
            } else {
                if (!tracker.get(monthNum).containsKey(user)) {
                    tracker.get(monthNum).put(user, distance);
                } else {
                    Integer newDistance = tracker.get(monthNum).get(user);
                    tracker.get(monthNum).put(user, newDistance + distance);
                }
            }
        }

        for (Map.Entry<String, Map<String, Integer>> entry : tracker.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            List<String> print;

            List<Map.Entry<String, Integer>> toSort = new ArrayList<>();
            for (Map.Entry<String, Integer> e : entry.getValue().entrySet()) {
                toSort.add(e);
            }
            
            toSort.sort((a, b) -> a.getKey().compareTo(b.getKey()));

            print = toSort.stream().map(e -> String.format("%s(%d)", e.getKey(), e.getValue())).collect(Collectors.toList());
            System.out.print(print.toString().replaceAll("[\\[\\]]", ""));
            print.clear();
            System.out.println();
        }

    }
}
