package strategypattern.vehicle;

import strategypattern.strategy.DrivingStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(DrivingStrategy strategy) {
        super(strategy);
    }
}
