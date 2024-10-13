package org.example.rmidemo;

import org.example.rmidemo.service.HelloWorld;
import org.example.rmidemo.service.impl.HelloWorldImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServerInitializer {

    public static void init() {
        try {
            HelloWorld helloWorld = new HelloWorldImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("HelloWorldService", helloWorld);
            System.out.println("RMI server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}