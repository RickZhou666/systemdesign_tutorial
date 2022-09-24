package com.rick.pattern_11_proxy.d01_gumballmachine_monitor_remote.d04_stateversion_gumballmachine;

/**
 * @Author: Rick
 * @Date: 2022/9/21 22:10
 */
public class SoldOutState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
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
    public void refill(int numberGumballs) {
        gumballMachine.setCount(numberGumballs);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "SoldOutState{}";
    }
}
