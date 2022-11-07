import java.util.*;

public class Logs_Aggregator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> durationData = new TreeMap<>();
        Map<String, TreeSet<String> > ipInfo = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String [] line = scanner.nextLine().split("\\s+");
            String IP = line[0];
            String user = line[1];
            int duration = Integer.parseInt(line[2]);

            if (!durationData.containsKey(user)) {
                durationData.put(user, duration);
            } else {
                int oldDuration = durationData.get(user);
                durationData.put(user, oldDuration + duration);
            }

            if (!ipInfo.containsKey(user)) {
                ipInfo.put(user, new TreeSet<>());
                ipInfo.get(user).add(IP);
            } else {
                ipInfo.get(user).add(IP);
            }
        }

        for (Map.Entry<String, Integer> entry : durationData.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
            for (Map.Entry<String, TreeSet<String>> entry2 : ipInfo.entrySet()) {
                if (entry2.getKey().equals(entry.getKey())) {
                    System.out.println(entry2.getValue());
                }
            }
        }

    }
}
