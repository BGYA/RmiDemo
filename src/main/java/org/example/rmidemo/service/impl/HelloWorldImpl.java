package org.example.rmidemo.service.impl;

import org.example.rmidemo.service.HelloWorld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld {
    public HelloWorldImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "hello,JINGJIANG学院";
    }
}
