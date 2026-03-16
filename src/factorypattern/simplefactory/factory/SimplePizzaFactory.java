package factorypattern.simplefactory.factory;

import factorypattern.simplefactory.pizza.CheezePizza;
import factorypattern.simplefactory.pizza.PepperoniPizza;
import factorypattern.simplefactory.pizza.Pizza;
import factorypattern.simplefactory.pizza.VeggiePizza;

import java.util.HashMap;
import java.util.function.Supplier;

public class SimplePizzaFactory {

    private final HashMap<Class<? extends Pizza>, Supplier<Pizza>> PIZZA_TYPE_TO_PIZZA_MAP;

    public SimplePizzaFactory() {
        PIZZA_TYPE_TO_PIZZA_MAP = new HashMap<>();
        registerPizzas();
    }

    public Pizza createPizza(Class<? extends Pizza> pizzaClass) {
        Supplier<Pizza> pizzaSupplier = PIZZA_TYPE_TO_PIZZA_MAP.get(pizzaClass);

        if (pizzaSupplier == null) {
            throw new RuntimeException("Provide a valid Pizza Type");
        }

        return pizzaSupplier.get();
    }

    private void registerPizzas() {
        PIZZA_TYPE_TO_PIZZA_MAP.put(CheezePizza.class, CheezePizza::new);
        PIZZA_TYPE_TO_PIZZA_MAP.put(PepperoniPizza.class, PepperoniPizza::new);
        PIZZA_TYPE_TO_PIZZA_MAP.put(VeggiePizza.class, VeggiePizza::new);
    }
}
