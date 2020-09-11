package com.fhalcom.dev.desing.patterns.factory.pizza;

public class SimplePizzaStore {
    private SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public SimplePizzaStore() {
    }

    public SimplePizzaFactory getFactory() {
        return factory;
    }

    public void setFactory(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type)
    {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return  pizza;
    }
}
