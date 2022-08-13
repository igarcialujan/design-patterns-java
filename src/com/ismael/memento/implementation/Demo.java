package com.ismael.memento.implementation;

public class Demo {
    public static void main(String[] args) {
        var document = new Document();
        var history = new DocumentHistory();

        document.setContent("Hello");
        history.push(document.createDocumentState());

        document.setFontName("Monospace");
        history.push(document.createDocumentState());

        document.setFontSize(12);

        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);
    }
}
