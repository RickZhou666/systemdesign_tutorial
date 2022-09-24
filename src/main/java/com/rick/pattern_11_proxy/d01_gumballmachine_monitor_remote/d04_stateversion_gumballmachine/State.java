package com.rick.pattern_11_proxy.d01_gumballmachine_monitor_remote.d04_stateversion_gumballmachine;

import java.io.Serializable;

/**
 * @Author: Rick
 * @Date: 2022/9/21 22:05
 */
public interface State extends Serializable {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill(int numberGumballs);
}
