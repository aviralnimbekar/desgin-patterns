package factorypattern.simplefactory.pizza;

public class CheezePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Cheeze Pizza: Adding dough, sauce, and cheese");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheeze Pizza at 350°F for 15 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheeze Pizza into 8 slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing Cheeze Pizza");
    }
}
