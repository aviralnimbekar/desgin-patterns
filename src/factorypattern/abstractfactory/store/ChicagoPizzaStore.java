package factorypattern.abstractfactory.store;

import factorypattern.abstractfactory.model.PizzaType;
import factorypattern.abstractfactory.pizza.ChicagoStyleCheesePizza;
import factorypattern.abstractfactory.pizza.ChicagoStyleClamPizza;
import factorypattern.abstractfactory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {

//        If this logic is growing, Pizza creation can go to a simple factory
//        Here keeping it simple intentionally to learn about abstract factory not simple factory
        if (PizzaType.CHEESE.equals(pizzaType)) {
            return new ChicagoStyleCheesePizza();
        } else if (PizzaType.CLAM.equals(pizzaType)) {
            return new ChicagoStyleClamPizza();
        }

        return null;
    }
}
