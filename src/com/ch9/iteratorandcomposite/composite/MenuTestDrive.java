package com.ch9.iteratorandcomposite.composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course !");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(dessertMenu);

        pancakeHouseMenu.add(new MenuItem("Pancake1", "Super Pancake1", true, 2.00));
        pancakeHouseMenu.add(new MenuItem("Pancake2", "Ultimate Pancake2", true, 3.00));
        pancakeHouseMenu.add(new MenuItem("Pancake3", "Premium Pancake3", true, 4.00));

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(new MenuItem("Pizza", "4 cheese pizza with sausages", false, 3.89));
        dinerMenu.add(new MenuItem("Hamburger", "A delicious hamburger with cheese and onions", false, 3.89));

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        dessertMenu.add(new MenuItem("Cheese Cake", "Lemon Cheesecake", true, 2.30));
        dessertMenu.add(new MenuItem("Brownie", "Brownie with delicious chocolate", true, 1.25));

        cafeMenu.add(new MenuItem("Latte", "Latte Desc", true, 1.00));
        cafeMenu.add(new MenuItem("Americano", "Americano Desc", true, 1.50));
        cafeMenu.add(new MenuItem("Filtered Coffe", "Filtered Desc", true, 2.00));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
