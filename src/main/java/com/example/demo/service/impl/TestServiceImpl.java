package com.example.demo.service.impl;

import com.example.demo.dto.Person;
import com.example.demo.mapper.TestMapper;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Person> queryList(Person person) {
        List<Person> personList = testMapper.queryList(person);
        return personList;
    }
}
