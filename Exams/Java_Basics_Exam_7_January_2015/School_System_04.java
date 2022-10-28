import java.util.*;

public class School_System_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // print students by full name alpha
        // subjects alpha
        Map<String, Map<String, List<Double>>> studentsInfo = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            String fullName = firstName.concat(" ").concat(lastName);
            String subject = tokens[2];
            double grade = Double.parseDouble(tokens[3]);

            if (!studentsInfo.containsKey(fullName)) {
                studentsInfo.put(fullName, new TreeMap<>());
                studentsInfo.get(fullName).put(subject, new ArrayList<>());
                studentsInfo.get(fullName).get(subject).add(grade);
            } else {
                if (!studentsInfo.get(fullName).containsKey(subject)) {
                    studentsInfo.get(fullName).put(subject, new ArrayList<>());
                    studentsInfo.get(fullName).get(subject).add(grade);
                } else {
                    studentsInfo.get(fullName).get(subject).add(grade);
                }
            }
        }

        for (Map.Entry<String, Map<String, List<Double>>> entry : studentsInfo.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.print("[");
            List<String> print = new ArrayList<>();

            entry.getValue()
                    .entrySet()
                    .stream()
                    .forEach(e -> {
                        double sum = 0;
                        int size = e.getValue().size();
                        for (int i = 0; i < size; i++) {
                            sum += e.getValue().get(i);
                        }
                        
                        double avgSum = sum / size;
                        String format = String.format("%s - %.2f", e.getKey(), avgSum);
                        print.add(format);
                    });
            
            System.out.print(print.toString().replaceAll("[\\[\\]]", ""));
            print.clear();
            System.out.println("]");
        }

    }
}
