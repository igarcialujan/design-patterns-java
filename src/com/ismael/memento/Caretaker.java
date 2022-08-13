package com.ismael.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> states = new ArrayList<>();

    public void push(Memento state) {
        states.add(state);
    }

    public Memento pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
