import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double midGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double scholarshipByGrade = 0;
        double scholarshipSocial = 0;

        if (minSalary > income) {
            if (midGrade > 4.5) {
                scholarshipSocial = minSalary * 0.35;
            }
        } if (midGrade >= 5.5) {
            scholarshipByGrade = midGrade * 25;
        } if (scholarshipSocial > scholarshipByGrade) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarshipSocial));
        } else if (scholarshipSocial < scholarshipByGrade) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarshipByGrade));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
        
    }
}
