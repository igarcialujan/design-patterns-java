package com.ismael.adapter;

import com.ismael.adapter.thirdPartyFilters.Caramel;

// Inheritance approach. Not so flexible as composition.
public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
