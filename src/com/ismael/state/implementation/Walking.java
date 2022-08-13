package com.ismael.state.implementation;

public class Walking implements TravelMode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 3;
    }
}
