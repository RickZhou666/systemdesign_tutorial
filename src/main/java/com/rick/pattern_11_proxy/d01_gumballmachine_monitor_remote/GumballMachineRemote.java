package com.rick.pattern_11_proxy.d01_gumballmachine_monitor_remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author: Rick
 * @Date: 2022/9/23 23:26
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}
