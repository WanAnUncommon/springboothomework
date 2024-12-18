package com.example.springboothomework2.controller;

import com.example.springboothomework2.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${server.port}")
    String port;

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String home(String name){
        name="输入你的名字";
        System.out.println(person.getId());
        return "hello "+name+",i am from port:"+port;
    }

}
