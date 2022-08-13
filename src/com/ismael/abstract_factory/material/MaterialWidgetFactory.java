package com.ismael.abstract_factory.material;

import com.ismael.abstract_factory.Button;
import com.ismael.abstract_factory.TextBox;
import com.ismael.abstract_factory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
