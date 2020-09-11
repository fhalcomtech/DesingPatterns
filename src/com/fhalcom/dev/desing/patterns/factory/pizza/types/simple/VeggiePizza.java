package com.fhalcom.dev.desing.patterns.factory.pizza.types.simple;

import com.fhalcom.dev.desing.patterns.factory.pizza.Pizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.stylefactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public VeggiePizza() {
        this.name="Veggie";
    }

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name="Veggie";
    }

    @Override
    public void prepare() {
        this.name = this.getClass().getSimpleName() + this.ingredientFactory.getClass().getSimpleName();
        this.ingredientFactory.createDough();
        this.ingredientFactory.createSauce();
        this.ingredientFactory.createCheese();
        this.ingredientFactory.createVeggies();
        System.out.println(name + "Preparing...");
    }
}
