package factorypattern.simplefactory.pizza;

public class VeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza: Adding dough, sauce, cheese, and vegetables");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggie Pizza at 360°F for 16 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Veggie Pizza into 8 slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing Veggie Pizza");
    }
}
