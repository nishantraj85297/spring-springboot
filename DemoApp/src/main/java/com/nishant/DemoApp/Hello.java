package com.nishant.DemoApp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/adhiti")
    public String Greet()
    {
        return "Welcome back!";
    }
}
