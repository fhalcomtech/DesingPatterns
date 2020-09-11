package com.fhalcom.dev.desing.patterns.factory.pizza;

public abstract class FranchisesPizzaStore {

    public Pizza orderPizza(String type)
    {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return  pizza;
    }

    public abstract Pizza createPizza(String type);

}
