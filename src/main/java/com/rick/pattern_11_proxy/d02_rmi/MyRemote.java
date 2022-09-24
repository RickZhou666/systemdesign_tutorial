package com.rick.pattern_11_proxy.d02_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author: Rick
 * @Date: 2022/9/23 23:01
 */
public interface MyRemote extends Remote {
    // 返回类型必须实现serializable 接口，以便在TCP中传输
    // (1)primitive类型 或者 (2)实现serializable类型
    public String sayHello() throws RemoteException;
}
