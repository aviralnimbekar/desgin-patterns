package statePattern.state;


import statePattern.context.GumballMachineV2;

import java.util.Random;

public class HasQuarterState implements State {
    //    Added as part of another requirement
    Random randomWinner = new Random(System.currentTimeMillis());

    private GumballMachineV2 gumballMachine;

    public HasQuarterState(GumballMachineV2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int randomNumberOneInTen = randomWinner.nextInt(10);

        if (randomNumberOneInTen == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinningState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {
        System.out.println("Already have gumball, cant refill now");
    }

}


