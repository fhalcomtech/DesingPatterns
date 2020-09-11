package com.fhalcom.dev.desing.patterns.factory;

import com.fhalcom.dev.desing.patterns.factory.pizza.FranchisesPizzaStore;
import com.fhalcom.dev.desing.patterns.factory.pizza.Pizza;
import com.fhalcom.dev.desing.patterns.factory.pizza.franchise.CaliforniaStylePizzaStore;
import com.fhalcom.dev.desing.patterns.factory.pizza.franchise.ChicagoStylePizzaStore;
import com.fhalcom.dev.desing.patterns.factory.pizza.franchise.NYStylePizzaStore;

public class PizzaFactoryMain {
    public static void main(String[] args)
    {
        FranchisesPizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza("Cheese");

        pizzaStore = new ChicagoStylePizzaStore();
        pizzaStore.orderPizza("Clam");

        pizzaStore = new CaliforniaStylePizzaStore();
        pizzaStore.orderPizza("pepperoni");
    }
}
