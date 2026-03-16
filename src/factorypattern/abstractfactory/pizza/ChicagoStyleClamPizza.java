package factorypattern.abstractfactory.pizza;

public class ChicagoStyleClamPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago Style Clam Pizza: Deep dish with clams, garlic, and butter sauce");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chicago Style Clam Pizza at 350°F for 25 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Chicago Style Clam Pizza into square slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing Chicago Style Clam Pizza");
    }
}
