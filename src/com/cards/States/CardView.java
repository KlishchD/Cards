package com.cards.States;

import java.util.Scanner;
import com.cards.Card;
import com.cards.Main;

public class CardView extends State {

    private static final String CARD_SEARCH_TEXT = "Write word/phrase.";
    private static final String CARD_NOT_FOUND_TEXT = "There is no such card.";

    public void enter() {
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

    public void update() {
        State.current = State.menu;
    }
}
