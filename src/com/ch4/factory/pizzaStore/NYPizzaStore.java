package com.ch4.factory.pizzaStore;

import com.ch4.factory.ingredient.factory.NYPizzaIngredientFactory;
import com.ch4.factory.ingredient.factory.PizzaIngredientFactory;
import com.ch4.factory.pizza.*;

public class NYPizzaStore extends PizzaStore {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory =
            new NYPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY Style Veggie Pizza.");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY Style Clam Pizza");
        }

        return pizza;
    }
}
