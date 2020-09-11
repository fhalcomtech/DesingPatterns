package com.fhalcom.dev.desing.patterns.factory.pizza.types.simple;

import com.fhalcom.dev.desing.patterns.factory.pizza.Pizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.stylefactory.PizzaIngredientFactory;

import javax.swing.*;

public class PepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza() {this.name="Pepperoni";
    }

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
       this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.name = this.getClass().getSimpleName() + this.ingredientFactory.getClass().getSimpleName();
        this.cheese = ingredientFactory.createCheese();
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.pepperoni = ingredientFactory.createPepperoni();
        System.out.println(name + "Preparing...");
    }
}
