package strategypattern.main;

import strategypattern.strategy.NormalSpeedStrategy;
import strategypattern.strategy.SportsSpeedStrategy;
import strategypattern.vehicle.NormalVehicle;
import strategypattern.vehicle.OffRoadVehicle;
import strategypattern.vehicle.SportsVehicle;

public class StrategyPatternMain {

    static void main() {

        NormalVehicle normalVehicle = new NormalVehicle(new NormalSpeedStrategy());
        normalVehicle.drive();

        SportsVehicle sportsVehicle = new SportsVehicle(new SportsSpeedStrategy());
        sportsVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle(new SportsSpeedStrategy());
        offRoadVehicle.drive();

        OffRoadVehicle offRoadGoodsVehicle = new OffRoadVehicle(new NormalSpeedStrategy());
        offRoadGoodsVehicle.drive();
    }
}
