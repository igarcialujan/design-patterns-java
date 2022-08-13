package com.ismael.factory.implementation;

public class Demo {
    public static void main(String[] args) {
        // Standard scheduler using the Gregorian calendar
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());

        // Arabian scheduler using the Arabian calendar
        var arabianScheduler = new ArabianScheduler();
        arabianScheduler.schedule(new Event());
    }
}
