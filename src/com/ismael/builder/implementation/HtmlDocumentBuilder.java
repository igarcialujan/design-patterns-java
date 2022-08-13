package com.ismael.builder.implementation;

import com.ismael.builder.implementation.html.HtmlDocument;
import com.ismael.builder.implementation.html.HtmlImage;
import com.ismael.builder.implementation.html.HtmlParagraph;

public class HtmlDocumentBuilder implements DocumentBuilder {
    private HtmlDocument document = new HtmlDocument();

    @Override
    public void addText(Text text) {
        document.add(new HtmlParagraph(text.getContent()));
    }

    @Override
    public void addImage(Image image) {
        document.add(new HtmlImage(image.getSource()));
    }

    @Override
    public String getResult() {
        return document.toString();
    }
}
