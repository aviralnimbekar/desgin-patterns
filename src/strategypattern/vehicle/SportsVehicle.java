package strategypattern.vehicle;

import strategypattern.strategy.DrivingStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(DrivingStrategy strategy) {
        super(strategy);
    }
}
