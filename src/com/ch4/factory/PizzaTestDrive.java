package com.ch4.factory;

import com.ch4.factory.pizza.Pizza;
import com.ch4.factory.pizzaStore.ChicagoPizzaStore;
import com.ch4.factory.pizzaStore.NYPizzaStore;
import com.ch4.factory.pizzaStore.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
