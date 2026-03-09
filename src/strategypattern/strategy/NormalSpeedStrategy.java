package strategypattern.strategy;

public class NormalSpeedStrategy implements DrivingStrategy {

    @Override
    public void drive() {
//        System.out.println("***********************************************************************");
        System.out.println("This is " + this.getClass().getSimpleName() + " driving with Normal Speed");
        System.out.println("***********************************************************************");
    }
}
