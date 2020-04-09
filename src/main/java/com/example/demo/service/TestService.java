package com.example.demo.service;

import com.example.demo.dto.Person;

import java.util.List;

public interface TestService {

    List<Person> queryList(Person person);

}
