package com.ismael.chain_of_responsibility;

public class Compressor extends Handler {
    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compress");

        return false;
    }
}
