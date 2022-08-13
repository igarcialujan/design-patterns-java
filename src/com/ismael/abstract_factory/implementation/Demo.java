package com.ismael.abstract_factory.implementation;

public class Demo {
    public static void main(String[] args) {
        var homePage = new HomePage();
        homePage.setGoal(new WeightLossFactory());
    }
}
