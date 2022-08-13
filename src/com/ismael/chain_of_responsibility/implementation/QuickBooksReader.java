package com.ismael.chain_of_responsibility.implementation;

public class QuickBooksReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a QuickBooks file.");
    }
}
