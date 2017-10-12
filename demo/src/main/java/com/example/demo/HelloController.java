package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {

    @RequestMapping("/page1")
    public String page1(){
        return "page1";
    }

    @RequestMapping("/page2")
    public String page2(){
        return "page2";
    }



}
