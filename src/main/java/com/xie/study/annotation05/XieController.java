package com.xie.study.annotation05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class XieController {

    //@Autowired(required = false)
    @Autowired
    private XieService xieService;

    public void showXieService(){
        System.out.println(xieService);
    }
}
