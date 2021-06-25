package com.cards.States;

public class Exit extends State {
    public void enter() {
    }
    public void update() {
        State.current = null;
    }
}
