import java.util.HashSet;
import java.util.Scanner;

public class Pythagorean_Numbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        HashSet<Integer> squares = new HashSet<>();
        for (int num : nums) {
            squares.add(num * num);
        }
        
        int count = 0;
        for (int a : nums) {
            for (int b : nums) {
                int cSquare = a*a + b*b;
                if (a <= b && squares.contains(cSquare)) {
                    int c = (int)Math.sqrt(cSquare);
                    System.out.printf("%d*%d + %d*%d = %d*%d\n", a, a, b, b, c, c);
                    count++;
                }
            }
        }
        
        if (count == 0) {
            System.out.println("No");
        }
    }
}
