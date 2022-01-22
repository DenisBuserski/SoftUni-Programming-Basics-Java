package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityV = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double p1Pool = hours * p1;
        double p2Pool = hours * p2;
        double total = p1Pool + p2Pool;
        double litersOut = total - capacityV;

        if (total <= capacityV){
            double result = (total / capacityV) * 100;
            double result1 = (p1Pool / total) * 100;
            double result2 = (p2Pool / total) * 100;
            System.out.printf("The pool is %.2f %% full. Pipe 1: %.2f %%. Pipe 2: %.2f %%.", result, result1, result2);
        }
        else if(total > capacityV){

            System.out.printf("For %.2f the pool overflows with %.2f liters.", hours, litersOut);

        }

    }
}
