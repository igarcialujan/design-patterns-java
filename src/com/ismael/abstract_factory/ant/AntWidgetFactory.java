package com.ismael.abstract_factory.ant;

import com.ismael.abstract_factory.Button;
import com.ismael.abstract_factory.TextBox;
import com.ismael.abstract_factory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
