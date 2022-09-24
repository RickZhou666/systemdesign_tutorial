package com.rick.pattern_11_proxy.d01_gumballmachine_monitor_remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author: Rick
 * @Date: 2022/9/23 22:13
 */

/*
 *    1. 制作远程接口
 *    2. 制作远程实现
 *    3. 运行 rmiregistry
 *    4. 启动服务
 * */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    String location;
    int count;
    State state;

    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }
}
