package com.ch4.factory.pizzaStore;

import com.ch4.factory.ingredient.factory.ChicagoPizzaIngredientFactory;
import com.ch4.factory.ingredient.factory.PizzaIngredientFactory;
import com.ch4.factory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory =
            new ChicagoPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            pizza = new CheesePizza(new ChicagoPizzaIngredientFactory());
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza =  new VeggiePizza(new ChicagoPizzaIngredientFactory());
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(new ChicagoPizzaIngredientFactory());
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(new ChicagoPizzaIngredientFactory());
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }
}
