import java.math.BigDecimal;
import java.util.*;

public class Three_Largest_Numbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        BigDecimal[] nums = new BigDecimal[n];
        
        for (int i = 0; i < nums.length; i++) {
            String num = scanner.nextLine();
            nums[i] = new BigDecimal(num);
        }
        
        Arrays.sort(nums);
        int count = 3;
        for (int i = nums.length-1; i >= 0 && count > 0; i--, count--) {
            System.out.println(nums[i].toPlainString());
        }

    }
}
