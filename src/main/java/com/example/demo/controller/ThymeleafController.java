package com.example.demo.controller;

import com.example.demo.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    private ModelAndView modelAndView;

    @RequestMapping("/list")
    public ModelAndView list(){
        modelAndView = new ModelAndView();

        //一、简单传值String
        modelAndView.addObject("uname","李四");

        //二、传list集合
        List list = new ArrayList();
        list.add(new Person("李四",22,180));
        list.add(new Person("王五",23,190));
        list.add(new Person("小明",24,200));
        modelAndView.addObject("personList",list);

        //三、传一个html页面
        modelAndView.addObject("tohtml","<span style='color:red;'>这是thymeleaf的html页面</span>");

        modelAndView.setViewName("thymeleaflist");
        return modelAndView;
    }

}
