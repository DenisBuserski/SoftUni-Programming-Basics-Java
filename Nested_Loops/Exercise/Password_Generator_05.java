import java.util.Scanner;

public class Password_Generator_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                for (char c = 'a'; c < 'a' + l; c++) {
                    for (char d = 'a';  d < 'a' + l; d++) {
                        for (int e = 1; e <= n; e++) {
                            if ((e > a) && (e > b)) {
                                System.out.printf("%d%d%c%c%d ", a, b, c, d, e);
                            }
                        }

                    }
                }
            }
        }

    }
}
