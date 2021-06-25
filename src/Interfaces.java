import java.util.ArrayList;
import java.util.Scanner;

public class Interfaces {
    private static final String[] MENU_TEXT = {"Choose an action.",
            "(1) Create a card.",
            "(2) View Card.",
            "(3) Exit."};

    private static final String[] CARD_CHANGE_TEXT = {"Write word/phrase.",
            "Write meaning.",
            "Write Synonyms."};

    private static final String CARD_SEARCH_TEXT = "Write word/phrase.";
    private static final String CARD_NOT_FOUND_TEXT = "There is no such card.";


    private static final int OPTION_NUMBER = 3;

    private static void createCardOption() {
        ArrayList<String> data = new ArrayList<>();
        for (String line : CARD_CHANGE_TEXT) {
            System.out.println(line);
            data.add(new Scanner(System.in).nextLine());
        }
        Main.Cards.add(new Card(data.get(0), data.get(1), data.get(2)));
    }

    private static void searchCardOption() {
        System.out.println(CARD_SEARCH_TEXT);
        String phrase = new Scanner(System.in).nextLine();
        boolean isFound = false;
        for (Card card : Main.Cards) {
            if (card.getPhrase().equals(phrase)) {
                card.printCard();
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println(CARD_NOT_FOUND_TEXT);
        }
    }

    public static boolean menu() throws Exception {
        printMenuText();
        int option = new Scanner(System.in).nextInt();
        boolean exit = false;
        switch (option) {
            case 1:
                createCardOption();
                break;
            case 2:
                searchCardOption();
                break;
            case 3:
                exit = true;
                break;
            default:
                throw new Exception("Incorrect option. Options are in range [1, " + OPTION_NUMBER + "]");
        }
        return !exit;
    }

    private static void printMenuText() {
        for (String line : MENU_TEXT) {
            System.out.println(line);
        }
    }
}
