package com.cards.States;

import com.cards.Card;
import com.cards.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateCard extends State {

    private static final String[] CARD_CREATION_TEXT = {"Write word/phrase.",
            "Write meaning.",
            "Write Synonyms."};

    public void enter() {
        ArrayList<String> data = new ArrayList<>();
        for (String line : CARD_CREATION_TEXT) {
            System.out.println(line);
            data.add(new Scanner(System.in).nextLine());
        }
        Main.Cards.add(new Card(data.get(0), data.get(1), data.get(2)));
    }

    public void update() {
        State.current = State.menu;
    }
}
