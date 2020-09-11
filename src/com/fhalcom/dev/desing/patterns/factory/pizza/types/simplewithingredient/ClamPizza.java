package com.fhalcom.dev.desing.patterns.factory.pizza.types.simplewithingredient;

import com.fhalcom.dev.desing.patterns.factory.pizza.Pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        this.name = "Clam";
    }

    @Override
    public void prepare() {

    }
}
