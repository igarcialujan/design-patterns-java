package com.ismael.state.implementation;

public class Demo {
    public static void main(String[] args) {
        var service = new DirectionService(new Walking());
        service.getEta();
        service.getDirection();
    }
}
