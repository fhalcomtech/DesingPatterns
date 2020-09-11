package com.fhalcom.dev.desing.patterns.factory.pizza;

import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.cheese.Cheese;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.dough.Dough;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.clam.Clam;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.pepperoni.Pepperoni;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.extra.veggie.Veggie;
import com.fhalcom.dev.desing.patterns.factory.pizza.ingredient.sauce.Sauce;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggie[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;



    public abstract void prepare();

    public void bake()
    {System.out.println(this.name + " ==> baking... wait...");}

    public void cut()
    {System.out.println(this.name + " ==> Cuting... wait...");}

    public void box()
    {System.out.println(this.name + " ==> Preparing... wait...");}

}
