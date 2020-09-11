package com.fhalcom.dev.desing.patterns.factory.pizza.types.simple;

import com.fhalcom.dev.desing.patterns.factory.pizza.Pizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.stylefactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza() {
        this.name = "Cheese";
    }

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name="Veggie";
    }

    @Override
    public void prepare() {
        this.name = this.getClass().getSimpleName() +" ==> "+ this.ingredientFactory.getClass().getSimpleName();
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
        this.cheese = this.ingredientFactory.createCheese();
        System.out.println(this.name + "  ==> Preparing... ");
    }
}
