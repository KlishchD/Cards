package com.cards.States;

import java.util.Scanner;

public class Menu extends State {

    private static final String[] MENU_TEXT = {"Choose an action.",
            "(1) Create a card.",
            "(2) View Card.",
            "(3) Exit."};

    private static final int OPTION_NUMBER = 3;


    public void enter() {
        for (String line : MENU_TEXT) {
            System.out.println(line);
        }
    }

    public void update() throws Exception {
        int option = new Scanner(System.in).nextInt();
        switch (option) {
            case 1:
                State.current = State.createCard;
                break;
            case 2:
                State.current = State.cardView;
                break;
            case 3:
                State.current = State.exit;
                break;
            default:
                throw new Exception("Incorrect option. Options are in range [1, " + OPTION_NUMBER + "]");
        }
    }
}
