package com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.stylefactory;

import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.cheese.Cheese;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.cheese.ReggianoChesse;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.dough.Dough;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.dough.ThinCrusDough;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.clam.Clam;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.clam.FreeshClams;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.pepperoni.Pepperoni;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.pepperoni.SlicedPepperoni;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.veggie.*;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.sauce.MarinaraSauce;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrusDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoChesse();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreeshClams();
    }
}
