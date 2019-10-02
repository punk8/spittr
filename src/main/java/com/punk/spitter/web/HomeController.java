package com.punk.spitter.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/", "homepage"})
public class HomeController {

//    @RequestMapping(value = "/",method = RequestMethod.GET)
//    public String home(){
//        return "home";  //视图名为home
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
