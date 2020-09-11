package com.fhalcom.dev.desing.patterns.factory.pizza.types.newyork;

import com.fhalcom.dev.desing.patterns.factory.pizza.Pizza;

public class NewYorkCheesePizza extends Pizza {
    public NewYorkCheesePizza() {
        this.name = "NYCheese";
    }

    @Override
    public void prepare() {

    }
}
