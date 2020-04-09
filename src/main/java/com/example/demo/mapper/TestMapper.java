package com.example.demo.mapper;

import com.example.demo.dto.Person;

import java.util.List;

public interface TestMapper {

    List<Person> queryList(Person person);

}
