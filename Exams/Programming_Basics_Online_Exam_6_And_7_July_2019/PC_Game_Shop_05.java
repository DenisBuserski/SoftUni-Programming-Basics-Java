import java.util.Scanner;

public class PC_Game_Shop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soldGames = Double.parseDouble(scanner.nextLine());
        int hearthstoneNum = 0;
        int forniteNum = 0;
        int overwatchNum = 0;
        int othersNum = 0;

        for (int a = 1; a <= soldGames; a++) {
            String nameGame = scanner.nextLine();

            if (nameGame.equals("Hearthstone")) {
                hearthstoneNum++;
            }
            if (nameGame.equals("Fornite")) {
                forniteNum++;
            }
            if (nameGame.equals("Overwatch")) {
                overwatchNum++;
            }
            if (!nameGame.equals("Hearthstone") && !nameGame.equals("Fornite") && !nameGame.equals("Overwatch")) {
                othersNum++;
            }
        }
        
        double hearthstoneP = (hearthstoneNum / soldGames) * 100;
        double forniteP = (forniteNum / soldGames) * 100;
        double overwatchP = (overwatchNum / soldGames) * 100;
        double othersP = (othersNum / soldGames) * 100;

        System.out.printf("Hearthstone - %.2f%%%n", hearthstoneP);
        System.out.printf("Fornite - %.2f%%%n", forniteP);
        System.out.printf("Overwatch - %.2f%%%n", overwatchP);
        System.out.printf("Others - %.2f%%%n", othersP);
    }
}
