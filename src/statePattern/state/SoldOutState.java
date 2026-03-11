package statePattern.state;

import statePattern.context.GumballMachineV2;

public class SoldOutState implements State {

    private final GumballMachineV2 gumballMachine;

    public SoldOutState(GumballMachineV2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {
        System.out.println("Gumball refilled");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

}
