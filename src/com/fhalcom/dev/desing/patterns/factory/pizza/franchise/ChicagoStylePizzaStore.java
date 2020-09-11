package com.fhalcom.dev.desing.patterns.factory.pizza.franchise;

import com.fhalcom.dev.desing.patterns.factory.pizza.FranchisesPizzaStore;
import com.fhalcom.dev.desing.patterns.factory.pizza.Pizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.stylefactory.ChicagoPizzaIngredientFactory;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.stylefactory.NYPizzaIngredientFactory;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.stylefactory.PizzaIngredientFactory;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.chicago.ChicagoCheesePizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.chicago.ChicagoClamPizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.chicago.ChicagoPepperoniPizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.chicago.ChicagoVeggiePizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.simple.CheesePizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.simple.ClamPizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.simple.PepperoniPizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.types.simple.VeggiePizza;

public class ChicagoStylePizzaStore extends FranchisesPizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equalsIgnoreCase("cheese")) pizza = new CheesePizza(ingredientFactory);
        else if(type.equalsIgnoreCase("pepperoni")) pizza = new PepperoniPizza(ingredientFactory);
        else if(type.equalsIgnoreCase("clam")) pizza = new ClamPizza(ingredientFactory);
        else if(type.equalsIgnoreCase("veggie")) pizza = new VeggiePizza(ingredientFactory);
        return pizza;
    }
}
