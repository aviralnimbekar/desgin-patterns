package factorypattern.simplefactory.pizza;

public class PepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza: Adding dough, sauce, cheese, and pepperoni");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza at 375°F for 18 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni Pizza into 8 slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni Pizza");
    }
}
