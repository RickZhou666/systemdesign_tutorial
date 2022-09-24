package com.rick.pattern_11_proxy.d01_gumballmachine_monitor_remote.d04_stateversion_gumballmachine;

import java.util.Random;

/**
 * @Author: Rick
 * @Date: 2022/9/21 22:11
 */
public class HasQuarterState implements State {
    private static final long serialVersionUID = 2L;
    Random randomWinner = new Random(System.currentTimeMillis());
    transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
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
        // state = NO_QUARTER;
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill(int numberGumballs) {
        System.out.println("there still has gumballs");
    }

    @Override
    public String toString() {
        return "HasQuarterState{}";
    }
}
