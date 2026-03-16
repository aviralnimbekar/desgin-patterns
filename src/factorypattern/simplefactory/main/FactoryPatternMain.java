package factorypattern.simplefactory.main;

import factorypattern.simplefactory.pizza.CheezePizza;
import factorypattern.simplefactory.pizza.PepperoniPizza;
import factorypattern.simplefactory.pizza.VeggiePizza;
import factorypattern.simplefactory.store.PizzaStore;

public class FactoryPatternMain {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore();

        pizzaStore.orderPizza(CheezePizza.class);
        pizzaStore.orderPizza(PepperoniPizza.class);
        pizzaStore.orderPizza(VeggiePizza.class);
    }
}
