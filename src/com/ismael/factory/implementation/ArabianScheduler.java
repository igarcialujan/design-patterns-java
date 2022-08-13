package com.ismael.factory.implementation;

public class ArabianScheduler extends Scheduler {
    @Override
    protected Calendar createCalendar() {
        return new ArabianCalendar();
    }
}
