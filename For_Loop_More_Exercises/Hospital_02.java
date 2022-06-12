import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int patientsYes = 0;
        int patientsNo = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 3 == 0) {
                if (patientsNo > patientsYes) {
                    doctors++;
                }
            }

            int patients = Integer.parseInt(scanner.nextLine());
            if (doctors < patients) {
                patientsYes += doctors;
                patientsNo += patients - doctors;
            } else {
                patientsYes += patients;
            }
        }
        
        System.out.printf("Treated patients: %d.%n", patientsYes);
        System.out.printf("Untreated patients: %d.", patientsNo);
    }
}
