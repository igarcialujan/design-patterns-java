package com.ismael.abstract_factory.app;

import com.ismael.abstract_factory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
