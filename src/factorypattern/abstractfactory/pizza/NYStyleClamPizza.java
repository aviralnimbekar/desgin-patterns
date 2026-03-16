package factorypattern.abstractfactory.pizza;

public class NYStyleClamPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing NY Style Clam Pizza: Thin crust with white sauce, clams, and garlic");
    }

    @Override
    public void bake() {
        System.out.println("Baking NY Style Clam Pizza at 425°F for 12 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NY Style Clam Pizza into large slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Style Clam Pizza");
    }
}
