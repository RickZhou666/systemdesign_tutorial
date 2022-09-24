package com.rick.pattern_11_proxy.d01_gumballmachine_monitor_remote.d04_stateversion_gumballmachine;


/**
 * @Author: Rick
 * @Date: 2022/9/21 22:05
 */
public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill(int numberGumballs) {
        System.out.println("there still has gumballs");
    }

    @Override
    public String toString() {
        return "NoQuarterState{}";
    }
}
