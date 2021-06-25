package com.cards.States;

public abstract class State {
    static public State menu, createCard, cardView, exit, current;

    public void enter() {}
    public void update() throws Exception {}
}
