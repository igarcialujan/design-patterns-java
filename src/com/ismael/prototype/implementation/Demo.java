package com.ismael.prototype.implementation;

public class Demo {
    public static void main(String[] args) {
        var timeline = new Timeline();
        var text = new Text("Hello");
        timeline.add(text);

        var menu = new ContextMenu(timeline);
        menu.duplicate(text);
    }
}
