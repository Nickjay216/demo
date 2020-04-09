package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.dto.Person;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestContorller {

    @Autowired
    private TestService testService;


    @RequestMapping("/hello")
    public String index() {
        Person person = new Person();
        person.setAge(25);
        List<Person> personList = testService.queryList(person);
        String json = JSON.toJSONString(personList);
        System.out.println(json);
        return personList.toString();
        //return "Hello World, The First SpringBoot Project";
    }

}