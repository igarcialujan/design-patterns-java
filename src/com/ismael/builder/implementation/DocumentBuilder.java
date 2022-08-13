package com.ismael.builder.implementation;

public interface DocumentBuilder {
    void addText(Text text);
    void addImage(Image image);
    String getResult();
}
