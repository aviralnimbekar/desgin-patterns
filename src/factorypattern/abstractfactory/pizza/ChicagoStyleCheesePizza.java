package factorypattern.abstractfactory.pizza;

public class ChicagoStyleCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago Style Cheese Pizza: Deep dish with extra mozzarella and chunky tomato sauce on top");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chicago Style Cheese Pizza at 350°F for 25 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Chicago Style Cheese Pizza into square slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing Chicago Style Cheese Pizza");
    }
}
