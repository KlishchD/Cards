package com.cards;

import com.cards.States.*;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Card> Cards = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        State.createCard = new CreateCard();
        State.menu = new Menu();
        State.cardView = new CardView();
        State.exit = new Exit();
        State.current = State.menu;
        while (State.current != null) {
            State.current.enter();
            State.current.update();
        }
    }

}
