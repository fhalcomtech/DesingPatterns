package com.fhalcom.dev.desing.patterns.factory.pizza.types.simplewithingredient;

import com.fhalcom.dev.desing.patterns.factory.pizza.Pizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.stylefactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;


    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name="Cheese";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing... " + name);
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
        this.cheese = this.ingredientFactory.createCheese();
    }
}
