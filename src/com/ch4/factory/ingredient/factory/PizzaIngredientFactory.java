package com.ch4.factory.ingredient.factory;

import com.ch4.factory.ingredient.*;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggie[] createVeggies();

    Pepperoni createPepperoni();

    Clam createClam();

}
