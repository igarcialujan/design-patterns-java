package com.ismael.abstract_factory.ant;

import com.ismael.abstract_factory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
