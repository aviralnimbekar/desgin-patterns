package factorypattern.abstractfactory.store;

import factorypattern.abstractfactory.model.PizzaType;
import factorypattern.abstractfactory.pizza.NYStyleCheesePizza;
import factorypattern.abstractfactory.pizza.NYStyleClamPizza;
import factorypattern.abstractfactory.pizza.Pizza;


public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {

//        If this logic is growing, Pizza creation can go to a simple factory
//        Here keeping it simple intentionally to learn about abstract factory not simple factory
        if (PizzaType.CHEESE.equals(pizzaType)) {
            return new NYStyleCheesePizza();
        } else if (PizzaType.CLAM.equals(pizzaType)) {
            return new NYStyleClamPizza();
        }

        return null;
    }
}
