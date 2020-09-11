package com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.stylefactory;


import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.cheese.Cheese;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.dough.Dough;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.clam.Clam;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.pepperoni.Pepperoni;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.veggie.Veggie;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.sauce.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
