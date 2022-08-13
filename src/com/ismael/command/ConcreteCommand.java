package com.ismael.command;

// In this example ConcreteCommand simulates AddCustomerCommand
public class ConcreteCommand implements Command {
    private Receiver service;

    public ConcreteCommand(Receiver service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
