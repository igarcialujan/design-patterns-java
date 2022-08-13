package com.ismael.command;

// In this example Invoker simulates a Button
public class Invoker {
    private String label;
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
