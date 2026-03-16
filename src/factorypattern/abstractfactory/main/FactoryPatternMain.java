package factorypattern.abstractfactory.main;

import factorypattern.abstractfactory.model.PizzaType;
import factorypattern.abstractfactory.store.ChicagoPizzaStore;
import factorypattern.abstractfactory.store.NYPizzaStore;
import factorypattern.abstractfactory.store.PizzaStore;

public class FactoryPatternMain {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza(PizzaType.CHEESE);
        pizzaStore.orderPizza(PizzaType.CLAM);


        PizzaStore pizzaStore2 = new ChicagoPizzaStore();

        pizzaStore2.orderPizza(PizzaType.CHEESE);
        pizzaStore2.orderPizza(PizzaType.CLAM);
    }
}
