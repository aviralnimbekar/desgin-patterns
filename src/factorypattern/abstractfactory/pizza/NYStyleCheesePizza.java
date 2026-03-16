package factorypattern.abstractfactory.pizza;

public class NYStyleCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing NY Style Cheese Pizza: Thin crust with marinara sauce and mozzarella");
    }

    @Override
    public void bake() {
        System.out.println("Baking NY Style Cheese Pizza at 425°F for 12 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NY Style Cheese Pizza into large slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Style Cheese Pizza");
    }
}
