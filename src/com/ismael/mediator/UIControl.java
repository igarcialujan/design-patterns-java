package com.ismael.mediator;

import java.util.ArrayList;
import java.util.List;

// In this example Mediator simulates a UIControl, and is implemented using the Observer pattern
public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer) {
        eventHandlers.add(observer);
    }

    protected void notifyEventHandlers() {
        for (var observer : eventHandlers)
            observer.handle();
    }
}
