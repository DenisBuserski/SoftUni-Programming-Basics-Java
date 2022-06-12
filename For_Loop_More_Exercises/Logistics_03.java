import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cargo = Integer.parseInt(scanner.nextLine());
        int tonsPerLoad= 0;
        double priceTonLoads = 0;
        double avaragePricePerTonLoad = 0;
        double percentPerLoadByBus = 0;
        double percentPerLoadByTruck = 0;
        double percentPerLoadByTrain = 0;

        for (int i = 1; i <= cargo; i++) {
            int weight = Integer.parseInt(scanner.nextLine());
            if (weight <= 3) {
                tonsPerLoad += weight;
                priceTonLoads += weight * 200;
                percentPerLoadByBus += weight;
            } else if (weight <= 11) {
                tonsPerLoad += weight;
                priceTonLoads += weight * 175;
                percentPerLoadByTruck += weight;
            } else {
                tonsPerLoad += weight;
                priceTonLoads += weight * 120;
                percentPerLoadByTrain += weight;
            }
        }
        
        avaragePricePerTonLoad = priceTonLoads / tonsPerLoad;

        System.out.printf("%.2f%n",avaragePricePerTonLoad);
        System.out.printf("%.2f%%%n",percentPerLoadByBus / tonsPerLoad * 100);
        System.out.printf("%.2f%%%n",percentPerLoadByTruck / tonsPerLoad * 100);
        System.out.printf("%.2f%%",percentPerLoadByTrain / tonsPerLoad * 100);
    }
}
