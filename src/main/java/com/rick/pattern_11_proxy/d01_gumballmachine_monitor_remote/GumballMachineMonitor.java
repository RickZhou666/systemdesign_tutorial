package com.rick.pattern_11_proxy.d01_gumballmachine_monitor_remote;

/**
 * @Author: Rick
 * @Date: 2022/9/23 22:14
 */
public class GumballMachineMonitor {
    // GumballMachine gumballMachine;
    GumballMachineRemote gumballMachine;

    public GumballMachineMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Current Inventory: " + gumballMachine.getCount() + " gumballs");
            System.out.println("Current State: " + gumballMachine.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
