package com.ismael.strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG");
    }
}
