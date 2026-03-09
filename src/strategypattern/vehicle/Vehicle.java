package strategypattern.vehicle;

import strategypattern.strategy.DrivingStrategy;

public class Vehicle {

    private final DrivingStrategy strategy;


    public Vehicle(DrivingStrategy strategy) {
        this.strategy = strategy;
    }

    public void drive() {
        System.out.println("This is " + this.getClass().getSimpleName());
        strategy.drive();
    }
}
