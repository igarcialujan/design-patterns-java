package com.ismael.abstract_factory.material;

import com.ismael.abstract_factory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
