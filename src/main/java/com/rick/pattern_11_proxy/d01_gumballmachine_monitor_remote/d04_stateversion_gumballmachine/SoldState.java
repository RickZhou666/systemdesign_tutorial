package com.rick.pattern_11_proxy.d01_gumballmachine_monitor_remote.d04_stateversion_gumballmachine;

/**
 * @Author: Rick
 * @Date: 2022/9/21 22:11
 */
public class SoldState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }

    @Override
    public void refill(int numberGumballs) {
        System.out.println("there still has gumballs");
    }

    @Override
    public String toString() {
        return "SoldState{}";
    }
}
