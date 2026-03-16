package factorypattern.abstractfactory.store;

import factorypattern.abstractfactory.model.PizzaType;
import factorypattern.abstractfactory.pizza.Pizza;

public abstract class PizzaStore {

    public void orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        System.out.println("I am a : " + pizza.getClass().getSimpleName() + " : " + pizza.hashCode());

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.escNextLine();
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);

}
