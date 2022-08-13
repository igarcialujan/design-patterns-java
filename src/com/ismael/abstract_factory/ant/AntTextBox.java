package com.ismael.abstract_factory.ant;

import com.ismael.abstract_factory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
