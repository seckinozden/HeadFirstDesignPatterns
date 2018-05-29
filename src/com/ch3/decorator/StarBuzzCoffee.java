package com.ch3.decorator;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();

        System.out.println("Beverage: " + espresso.getDescription());
        System.out.println("Cost: $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);

        System.out.println("Beverage: " + darkRoast.getDescription());
        System.out.println("Cost: $" + darkRoast.cost());


        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);

        System.out.println("Beverage: " + houseBlend.getDescription());
        System.out.println("Cost: $" + houseBlend.cost());
    }
}
