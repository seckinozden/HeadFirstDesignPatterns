package com.ch4.factory;

import com.ch4.factory.ingredient.factory.ChicagoPizzaIngredientFactory;
import com.ch4.factory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CheesePizza(new ChicagoPizzaIngredientFactory());
        } else if (item.equals("veggie")) {
            return new VeggiePizza(new ChicagoPizzaIngredientFactory());
        } else if (item.equals("clam")) {
            return new ClamPizza(new ChicagoPizzaIngredientFactory());
        } else if (item.equals("pepperoni")) {
            return new PepperoniPizza(new ChicagoPizzaIngredientFactory());
        } else return null;
    }

}
