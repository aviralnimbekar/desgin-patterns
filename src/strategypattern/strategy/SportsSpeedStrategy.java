package strategypattern.strategy;

public class SportsSpeedStrategy implements DrivingStrategy {

    @Override
    public void drive() {
        System.out.println("This is " + this.getClass().getSimpleName() + " driving with Sports Speed");
        System.out.println("***********************************************************************");
    }
}
