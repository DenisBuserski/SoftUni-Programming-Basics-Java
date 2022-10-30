import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cognate_Words_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("[^A-z]+");
        Set<String> outputs = new HashSet<>();

        int count = 0;
        for (int index1 = 0; index1 < input.length; index1++) {
            for (int index2 = 0; index2 < input.length; index2++) {
                for (int index3 = 0; index3 < input.length; index3++) {
                    String firstWord = input[index1].concat(input[index2]);
                    if (firstWord.equals(input[index3])) {
                        String out = input[index1] + "|" + input[index2] + "=" + input[index3];
                        outputs.add(out);
                        count++;
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println("No");
        } else {
            outputs.forEach(System.out::println);
        }
    }
}
