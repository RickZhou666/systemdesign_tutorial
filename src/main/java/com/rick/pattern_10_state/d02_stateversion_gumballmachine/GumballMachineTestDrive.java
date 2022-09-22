package com.rick.pattern_10_state.d02_stateversion_gumballmachine;

/**
 * @Author: Rick
 * @Date: 2022/9/21 22:51
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        System.out.println("\n======= first action =======");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        System.out.println("\n======= second action =======");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
