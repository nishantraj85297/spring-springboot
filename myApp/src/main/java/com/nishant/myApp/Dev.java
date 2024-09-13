package com.nishant.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
//    @Autowired  //field injection
//    public Laptop laptop;


    @Autowired
    @Qualifier("laptop") //in case of confusion this will choose laptop class instead of Desktop
    public Computer comp;

//    public Dev(Laptop laptop)   //constructor injectio
//    {
//        this.laptop=laptop;
//    }
//
//
//    public void setLaptop(Laptop laptop)
//    {
//        this.laptop=laptop;
//    }
    public void build()
    {
        comp.compile();
        System.out.println("working on awesome project");
    }
}
