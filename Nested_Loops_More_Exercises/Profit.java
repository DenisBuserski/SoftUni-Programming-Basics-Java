package NestedLoopsMoreExercises;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLv = Integer.parseInt(scanner.nextLine());
        int twoLv = Integer.parseInt(scanner.nextLine());
        int fiveLv = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int a = 0; a <= oneLv; a++) {
            for (int b = 0; b <= twoLv; b++) {
                for (int c = 0; c <= fiveLv; c++) {

                    if (a * 1 + b * 2 + c * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv. %n", a, b, c, sum);
                    }
                }
            }
        }
    }
}
//System.out.printf({бр. 1лв.} * 1 lv. + {бр. 2лв.} * 2 lv. + {бр. 5лв.} * 5 lv. = {сума} lv.");