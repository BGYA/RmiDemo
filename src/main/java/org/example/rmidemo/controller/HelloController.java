package org.example.rmidemo.controller;

import org.example.rmidemo.service.HelloWorld;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.Naming;


@RestController
public class HelloController {

//    @CrossOrigin(origins = "*")
    @RequestMapping("/hello")
    public String  helloWorld(){
        try {
            HelloWorld helloWorld = (HelloWorld)Naming.lookup("rmi://localhost/HelloWorldService");
            System.out.println("客户端程序已调用");
            System.out.println(helloWorld.sayHello());
            return helloWorld.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
          return "Error occurred";
        }
    }
}
