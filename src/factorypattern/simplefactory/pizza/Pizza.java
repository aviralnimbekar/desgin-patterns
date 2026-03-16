package factorypattern.simplefactory.pizza;

public interface Pizza {

    void prepare();

    void bake();

    void cut();

    void box();

    default void escNextLine() {
        System.out.println();
    }
}
