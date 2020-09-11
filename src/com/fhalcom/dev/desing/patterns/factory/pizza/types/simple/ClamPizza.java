package com.fhalcom.dev.desing.patterns.factory.pizza.types.simple;

import com.fhalcom.dev.desing.patterns.factory.pizza.Pizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.stylefactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza() {
        this.name = "Clam";
    }

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
       this.ingredientFactory =ingredientFactory;

    }

    @Override
    public void prepare() {
        this.name = this.getClass().getSimpleName() + this.ingredientFactory.getClass().getSimpleName();
        this.cheese = ingredientFactory.createCheese();
        this.clam = ingredientFactory.createClam();
        this.sauce = ingredientFactory.createSauce();
        this.dough = ingredientFactory.createDough();
        System.out.println(this.name);
    }
}
