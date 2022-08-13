package com.ismael.observer;

public class ConcreteObserverA implements Observer {
    private ConcreteSubject concreteSubject;

    public ConcreteObserverA(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified: " + concreteSubject.getValue());
    }
}
