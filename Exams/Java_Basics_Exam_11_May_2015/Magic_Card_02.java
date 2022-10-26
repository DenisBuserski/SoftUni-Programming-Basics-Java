import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magic_Card_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cards = scanner.nextLine().split("\\s+");
        String command = scanner.nextLine();
        String magicCard = scanner.nextLine();

        String magicPower = getPower(magicCard);
        String magicSuit = getSuit(magicCard);

        List<String> selectedCards = new ArrayList<>();

        if (command.equals("odd")) {
            odd(cards, selectedCards);
        } else if (command.equals("even")) {
            even(cards, selectedCards);
        }

        int totalSum = 0;
        for (String selectedCard : selectedCards) {
            String selectedCardPower = getPower(selectedCard);
            String selectedCardSuit = getSuit(selectedCard);

            int currentPower = 0;
            if (magicPower.equals(selectedCardPower)) {
                currentPower += getCardPower(selectedCardPower) * 3;
            } else if (magicSuit.equals(selectedCardSuit)) {
                currentPower += getCardPower(selectedCardPower) * 2;
            } else {
                currentPower = getCardPower(selectedCardPower);
            }
            totalSum += currentPower;
        }

        System.out.println(totalSum);
    }

    public static void even(String[] cards, List<String> selectedCards) {
        for (int index = 0; index < cards.length; index++) {
            if (index % 2 == 0) {
                selectedCards.add(cards[index]);
            }
        }
    }

    public static void odd(String[] cards, List<String> selectedCards) {
        for (int index = 0; index <= cards.length - 1; index++) {
            if (index % 2 != 0) {
                selectedCards.add(cards[index]);
            }
        }
    }

    private static int getCardPower(String selectedCardPower) {
        int power = 0;
        if (selectedCardPower.equals("J")) {
            power = 120;
        } else if (selectedCardPower.equals("Q")) {
            power = 130;
        } else if (selectedCardPower.equals("K")) {
            power = 140;
        } else if (selectedCardPower.equals("A")) {
            power = 150;
        } else {
            power = Integer.parseInt(selectedCardPower + "0");
        }

        return power;
    }

    private static String getSuit(String magicCard) {
        String magicSuit = "";
        String[] magicTokens = magicCard.split("");
        if (magicCard.length() == 3) {
            magicSuit = magicTokens[2];
        } else {
            magicSuit = magicTokens[1];
        }
        return magicSuit;
    }

    private static String getPower(String magicCard) {
        String magicPower = "";
        String[] magicTokens = magicCard.split("");
        if (magicCard.length() == 3) {
            magicPower = magicTokens[0] + magicTokens[1];
        } else {
            magicPower = magicTokens[0];
        }
        return magicPower;
    }
}
