package com.ismael.state;

public class ConcreteStateB implements State {
    @Override
    public void mouseDown() {
        System.out.println("ConcreteStateB icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
