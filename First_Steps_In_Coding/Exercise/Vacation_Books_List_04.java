import java.util.Scanner;

public class Vacation_Books_List_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeberPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int numeberDays = Integer.parseInt(scanner.nextLine());

        int hours = numeberPages / pages;
        int result = hours / numeberDays;

        System.out.println(result);
    }
}
