package factorypattern.simplefactory.store;

import factorypattern.simplefactory.factory.SimplePizzaFactory;
import factorypattern.simplefactory.pizza.Pizza;

public class PizzaStore {
    public final SimplePizzaFactory pizzaFactory;

    public PizzaStore() {
        this.pizzaFactory = new SimplePizzaFactory();
    }

    public void orderPizza(Class<? extends Pizza> pizzaType) {
        Pizza pizza = pizzaFactory.createPizza(pizzaType);
        System.out.println("I am a : " + pizza.getClass().getSimpleName() + " : " + pizza.hashCode());

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.escNextLine();
    }
}
