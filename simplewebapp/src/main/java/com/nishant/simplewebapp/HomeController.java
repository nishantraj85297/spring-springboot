package com.nishant.simplewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//public class HomeController {
//
//    @RequestMapping("/")
//    @ResponseBody
//    public String Greet()
//    {
//        return "Welcome to telusko !!";
//    }
//
//}

@RestController
public class HomeController {

    @RequestMapping("/")
    public String Greet()
    {
        return "Welcome to telusko !!";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "Welcome to about page  !!";
    }


}

