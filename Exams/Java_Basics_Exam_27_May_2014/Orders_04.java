import java.util.*;
import java.util.stream.Collectors;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> shop = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String [] tokens = scanner.nextLine().split("\\s+");
            String customer = tokens[0];
            int amount = Integer.parseInt(tokens[1]);
            String  product = tokens[2];

            if (!shop.containsKey(product)) {
                shop.put(product, new LinkedHashMap<>());
                shop.get(product).put(customer, amount);
            } else {
                if (!shop.get(product).containsKey(customer)) {
                    shop.get(product).put(customer, amount);
                } else {
                    int oldAmount = shop.get(product).get(customer);
                    shop.get(product).put(customer, oldAmount + amount);
                }
            }
        }

        for (Map.Entry<String, Map<String, Integer>> entry : shop.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            List<String> print;

            List<Map.Entry<String, Integer>> toSort = new ArrayList<>();

            for (Map.Entry<String, Integer> e : entry.getValue().entrySet()) {
                toSort.add(e);
            }
            toSort.sort((a, b) -> a.getKey().compareTo(b.getKey()));

            print = toSort.stream().map(e -> String.format("%s %d", e.getKey(), e.getValue())).collect(Collectors.toList());
            System.out.print(print.toString().replaceAll("[\\[\\]]", ""));
            print.clear();
            System.out.println();
        }

    }
}
