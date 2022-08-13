package com.ismael.strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
