package strategypattern.vehicle;

import strategypattern.strategy.DrivingStrategy;

public class NormalVehicle extends Vehicle {

    public NormalVehicle(DrivingStrategy strategy) {
        super(strategy);
    }

}
