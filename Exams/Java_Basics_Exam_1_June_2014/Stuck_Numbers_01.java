import java.util.Scanner;

public class Stuck_Numbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String [] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.next();
        }

        int count = 0;
        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers.length; b++) {
                for (int c = 0; c < numbers.length; c++) {
                    for (int d = 0; d < numbers.length; d++) {

                        if (!numbers[a].equals(numbers[b]) && !numbers[a].equals(numbers[c]) && !numbers[a].equals(numbers[d]) &&
                                !numbers[b].equals(numbers[c]) && !numbers[b].equals(numbers[d]) && !numbers[c].equals(numbers[d])) {

                            if (numbers[a].concat(numbers[b]).equals(numbers[c].concat(numbers[d]))) {
                                System.out.printf("%s|%s==%s|%s%n", numbers[a], numbers[b], numbers[c], numbers[d]);
                                count++;
                            }
                        }

                    }
                }
            }
        }
        
        if (count == 0) {
            System.out.println("No");
        }

    }
}
