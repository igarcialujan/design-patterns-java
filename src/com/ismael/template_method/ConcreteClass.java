package com.ismael.template_method;

// In this example ConcreteClass simulates a TransferMoneyTask
public class ConcreteClass extends AbstractClass {
    @Override
    protected void doExecute() {
        System.out.println("Transfer Money");
    }
}
