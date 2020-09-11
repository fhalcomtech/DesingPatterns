package com.fhalcom.dev.desing.patterns.factory.pizza;

import com.fhalcom.dev.desing.patterns.factory.pizza.types.simple.CheesePizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.simple.ClamPizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.simple.PepperoniPizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.simple.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese")) pizza = new CheesePizza();
        else if(type.equalsIgnoreCase("pepperoni")) pizza = new PepperoniPizza();
        else if(type.equalsIgnoreCase("clam")) pizza = new ClamPizza();
        else if(type.equalsIgnoreCase("veggie")) pizza = new VeggiePizza();
        return pizza;

    }
}
