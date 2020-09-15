package Factory.PizzaFramework;

import Factory.PizzaFramework.Pizza.Pizza;
import Factory.PizzaFramework.PizzaStore.ChicagoPizzaStore;
import Factory.PizzaFramework.PizzaStore.NYPizzaStore;
import Factory.PizzaFramework.PizzaStore.PizzaStore;

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
