package com.ismael.state;

// In this example Context simulates a Canvas
public class Context {
    private State currentState;

    public void mouseDown() {
        currentState.mouseDown();
    }

    public void mouseUp() {
        currentState.mouseUp();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
