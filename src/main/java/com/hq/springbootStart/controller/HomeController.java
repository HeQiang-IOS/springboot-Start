package com.hq.springbootStart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    public String sayHi() {
        return "Hi";
    }

    @RequestMapping(value = "/sayBye", method = RequestMethod.GET)
    public String sayBye() {
        return "Bye bye";
    }

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello";
    }

    @RequestMapping(value = "/sayWho", method = RequestMethod.GET)
    public String sayWho() {
        return "Who";
    }
}
