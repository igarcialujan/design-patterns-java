package com.ismael.strategy;

// In this example Context simulates an ImageStorage
public class Context {
    public void store(String fileName, Strategy compressor) {
        compressor.compress(fileName);
    }
}
