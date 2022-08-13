package com.ismael.observer;

public class ConcreteObserverB implements Observer {
    private ConcreteSubject concreteSubject;

    public ConcreteObserverB(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated: " + concreteSubject.getValue());
    }
}
