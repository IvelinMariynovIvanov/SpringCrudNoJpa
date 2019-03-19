package com.Ivelin.springmvc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class IndexController {

    @RequestMapping("/")
    public  String Index() {
        return "Index";
    }
}

