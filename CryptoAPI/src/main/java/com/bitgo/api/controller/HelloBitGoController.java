package com.bitgo.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBitGoController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }


}
