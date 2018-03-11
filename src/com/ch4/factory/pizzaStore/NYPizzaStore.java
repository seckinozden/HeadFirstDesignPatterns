package com.ch4.factory.pizzaStore;

import com.ch4.factory.ingredient.factory.NYPizzaIngredientFactory;
import com.ch4.factory.pizza.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CheesePizza(new NYPizzaIngredientFactory());
        } else if (item.equals("veggie")) {
            return new VeggiePizza(new NYPizzaIngredientFactory());
        } else if (item.equals("clam")) {
            return new ClamPizza(new NYPizzaIngredientFactory());
        } else if (item.equals("pepperoni")) {
            return new PepperoniPizza(new NYPizzaIngredientFactory());
        } else return null;
    }
}
