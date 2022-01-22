package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeFor1M = Double.parseDouble(scanner.nextLine());

        double distanceForRecord = distance * timeFor1M;
        double waterTime = Math.floor(distance / 15) * 12.5;
        double totalTime = distanceForRecord + waterTime;

        if(totalTime >= worldRecord){
            double difference = totalTime - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
        else if (totalTime < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
