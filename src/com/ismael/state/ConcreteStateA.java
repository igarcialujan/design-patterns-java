package com.ismael.state;

public class ConcreteStateA implements State {
    @Override
    public void mouseDown() {
        System.out.println("ConcreteStateA icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
