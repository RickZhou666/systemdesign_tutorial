package com.rick.pattern_11_proxy.d01_gumballmachine_monitor_remote;

import java.rmi.Naming;

/**
 * @Author: Rick
 * @Date: 2022/9/23 22:16
 */


// rmiregistry & java GumballMachineTestDrive santafe.mightygumball.com 100
// rmiregistry & java GumballMachineTestDrive boulder.mightygumball.com 100
// rmiregistry & java GumballMachineTestDrive austin.mightygumball.com 250


// java com/rick/pattern_11_proxy/d01_gumballmachine_monitor_remote.GumballMachineTestDrive santafe.mightygumball.com 100
// java com/rick/pattern_11_proxy/d01_gumballmachine_monitor_remote.GumballMachineTestDrive boulder.mightygumball.com 100
// java com/rick/pattern_11_proxy/d01_gumballmachine_monitor_remote.GumballMachineTestDrive austin.mightygumball.com 250
/**
 *      # search port
 *      lsof -i :1099
 *
 *      # kill PID
 *      kill 89771
 *
 *      # search multiple port
 *      lsof -i :8081,8082,8083,1099
 *      javac -d . *.java
 * */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = null;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        // count = Integer.parseInt(args[1]);
        // GumballMachine gumballMachine = new GumballMachine(args[0], count);
        // String location = "Santa_Clara";


        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
        GumballMachineMonitor monitor = new GumballMachineMonitor(gumballMachine);
        monitor.report();
    }
}
