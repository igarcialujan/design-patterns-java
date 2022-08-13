package com.ismael.abstract_factory.material;

import com.ismael.abstract_factory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
